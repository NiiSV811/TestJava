package co.edu.uptc.stringutil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {

    @Test
    void testReverseString() {
        StringUtil myUtil = new StringUtil();
        String normalStr = "Hola";
        String reversed = "aloH";

        assertEquals(reversed, myUtil.reverseString(normalStr));
    }

    @Test
    void testReversedOddStrings() {
        StringUtil myUtil = new StringUtil();
        String normalStr = "Holas";
        String expected = "saloH";

        assertEquals(expected, myUtil.reversedOddStrings(normalStr));
    }

    @Test
    void testIsPalindrome() {
        StringUtil myUtil = new StringUtil();
        String normalStr = "ana";
        boolean expected = true ;

        assertEquals(expected, myUtil.isPalindrome(normalStr));
    }

    @Test
    void testGenBiArray() {
        StringUtil myUtil = new StringUtil();
        String[] words = {"pana", "gana", "cana", "ventana"};
        char[] testArr = new char[]{'a','n','a'};
        char[][] biArray = myUtil.genBiArray(words);

        for(int i = 0; i < words.length; i++){
            assertArrayEquals(testArr, biArray[i]);
        }
    }

    @Test
    void testTwoCharsArrayEqual() {
        StringUtil myUtil = new StringUtil();
        char[] arr1 = new char[]{'a','b','c'};
        char[] arr2 = new char[]{'a','b', 'c'};

        assertTrue(myUtil.twoCharsArrayEqual(arr1, arr2));
    }

    @Test
    void testCheckRhymeOdds() {
        StringUtil myUtil = new StringUtil();
        String[] words = {"asdf", "lolsito", "zxcfh", "osito", "ashzkjxhv", "pendejito"};
        String result = "lolsito rima con osito osito rima con pendejito ";

        assertEquals(result, myUtil.checkRhymeOdds(words));
    }

    @Test
    void testCheckRhymeEven() {
        StringUtil myUtil = new StringUtil();
        String[] words = {"lolsito", "asdf", "osito", "asdzxc", "tamalito"};
        String result = "lolsito rima con osito osito rima con tamalito ";

        assertEquals(result, myUtil.checkRhymeEven(words));
    }
}