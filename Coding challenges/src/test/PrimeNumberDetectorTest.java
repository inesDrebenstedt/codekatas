package test;

import PrimeNumberDetector.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumberDetectorTest {

    @Test
    public void checkPrime(){
        int aPrime = 17;
        int notAPrime = 9;

        boolean  isPrime = PrimeNumberDetector.showIfPrime(aPrime);
        assert(isPrime);

        isPrime = PrimeNumberDetector.showIfPrime(notAPrime);
        assert(!isPrime);

    }

    @Test
    public void checkPrimes(){
        int[] numbers = {1, 2,3,4,5,6,7,8,9,10, 11};
        PrimeNumberDetector.checkPrimes(numbers);
        assertEquals( 6, PrimeNumberDetector.primeCounter);
    }
}
