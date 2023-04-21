package test;
import FindingTheNumbers.*;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class NumbersFinderTest {

    @Test
    public void checkIfHasTwin(){
        int[] numArray = {1, 2, 3, 2, 1, 4};
        ArrayList<Integer> results = NumbersFinder.lookUpNonTwins(numArray);
        assertEquals(2, results.size());
    }

}
