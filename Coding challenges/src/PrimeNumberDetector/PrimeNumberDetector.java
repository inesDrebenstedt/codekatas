package PrimeNumberDetector;

/*
Write a Java program to determine whether a number is prime or not

This program should accept an array of numbers.
It should iterate through the array of numbers and determine if each is prime or not.
Once it’s done processing, it should return only those numbers that are prime in an array.
 */
public class PrimeNumberDetector {

    public static int primeCounter = 0;

    public static boolean showIfPrime(int someNumber){
        boolean isPrime = true;
        loopThroughRange(isPrime, someNumber);

        return isPrime;
    }

    public static boolean loopThroughRange(boolean isPrime, int someNumber){
        for(int i = 2; i < someNumber; i++){
            if(((someNumber % i) == 0) && someNumber != 2){
                System.out.println( someNumber + " is not a prime number.");
                isPrime = false;
                break;
            }
        }
        handleIsPrime(isPrime, someNumber);

        return isPrime;
    }

    public static void handleIsPrime(boolean isPrime, int numberTwo){
        if(isPrime || numberTwo == 2){
            System.out.println(numberTwo + " is a prime number!");
            primeCounter++;
        }
    }

    public static void checkPrimes(int[] numbers){

        for(int number : numbers){
           showIfPrime(number);
        }
    }
}
