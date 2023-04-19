package test;
import FindingTheNumbers.*;
import org.junit.Test;

public class NumbersFinderTest {

    @Test
    public void checkIfHasTwin(){
        int[] numArray = {1, 2, 3, 2, 1, 4};
        int numberOfFoundTwins = NumbersFinder.lookUpTwins(numArray);
    }

}
