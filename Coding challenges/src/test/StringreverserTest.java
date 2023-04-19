package test;

import Stringreverser.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringreverserTest {

    public static final  String myString = "Hallo Welt!";

    @Test
    public void checkIfArray(){
        char[] charArr = StringReverser.makeCharArray("Hallo Welt!");
        boolean isOfTypeArray = charArr.getClass().isArray();
        assertTrue(isOfTypeArray);
    }

    @Test
    public void checkIfReversedCharArray(){
        char[] origCharArray = StringReverser.makeCharArray(myString);
        String reversedString = StringReverser.reverseCharArray(origCharArray);
        boolean isSameChar = myString.charAt(0) == reversedString.charAt(myString.length()-1);
        assertTrue(isSameChar);
    }

    @Test
    public void checkIfReversedString(){
        String reversedString = StringReverser.reverseString(myString);
        boolean isSameChar = myString.charAt(0) == reversedString.charAt(myString.length()-1);
        assertTrue(isSameChar);
    }
}
