package Stringreverser;

/*
 Write a Java program to reverse a string without using the reverse method of Java’s String class:
 */

public class StringReverser {

    public final String originalString = "Hallo Welt!";

    public static String reverseString(String origString){
        System.out.println("Original String is : " + origString);
        String reversedString = reverseCharArray(makeCharArray(origString));
        return reversedString;
    }

    public static char[] makeCharArray(String origString){
        return origString.toCharArray();
    }

    public static String reverseCharArray(char[] charArray){
        String reversedString = "";
        for(int i = charArray.length-1; i > -1; i--){
            reversedString += String.valueOf(charArray[i]);
        }
        System.out.println("Reversed  String: " + reversedString);
        return reversedString;
    }
}
