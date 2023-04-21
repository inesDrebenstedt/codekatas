package FindingTheNumbers;

import java.util.ArrayList;

public class NumbersFinder {

    public static ArrayList<Integer> lookUpNonTwins(int[] numArray){
        ArrayList<Integer> originalNumbers = new ArrayList<>();
        putArrayValsIntoList(originalNumbers, numArray);
        ArrayList<Integer> twinNumbers = identifyTwins(originalNumbers);
        ArrayList<Integer> nonTwinNumbers = removeTwins(twinNumbers, originalNumbers);

        return nonTwinNumbers;
    }

    public static ArrayList identifyTwins(ArrayList<Integer> originalNumbers){
        ArrayList<Integer> numbersWithTwins = new ArrayList<>();

        for(int i = 0; i < originalNumbers.size()-1; i++){
            for(int j = i+1; j < originalNumbers.size(); j++){
                if(originalNumbers.get(i).equals(originalNumbers.get(j))){
                    System.out.println(originalNumbers.get(i) + " has a twin!");
                    numbersWithTwins.add(originalNumbers.get(j));
                }
            }
        }

        return numbersWithTwins;
    }

    public static ArrayList removeTwins(ArrayList<Integer> twinNumbers, ArrayList<Integer> originalNumbers){
        ArrayList<Integer> nonTwins = new ArrayList<Integer>();

        originalNumbers.stream()
                .filter(item -> !twinNumbers.contains(item))
                .forEach(item -> {
                    System.out.println("has no twin: " + item);
                    nonTwins.add(item);
                });

        return nonTwins;
    }

    public static ArrayList putArrayValsIntoList(ArrayList<Integer> originalNumbers, int[] numArray){
        for(int val : numArray){
            originalNumbers.add(val);
        }
        return originalNumbers;
    }
}
