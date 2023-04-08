package co.edu.uptc.mathutil;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {

    @Test
    void testCountElementArray(){
        MathUtil myUtil = new MathUtil();
        int[] arr = {1,1,1,2,2,2};
        assertEquals(3, myUtil.countElementArray(1, arr));
    }

    @Test
    void testCountElementThisArray(){
        MathUtil myUtil = new MathUtil();
        assertEquals(2, myUtil.countElementArray(1));
    }

    @Test
    void testIsIntInArray(){
        MathUtil myUtil = new MathUtil();
        int[] arr = {1,2,3,4,5};
        assertTrue(myUtil.isIntInArray(2, arr));
    }

    @Test
    void testStringToNumArray(){
        MathUtil myUtil = new MathUtil();
        String strArr = "1,5,10,20";
        int[] intArr = {1,5,10,20};
        assertArrayEquals(intArr, myUtil.stringToNumArray(strArr));
    }

    @Test
    void testGenerateSet(){
        MathUtil myUtil = new MathUtil();
        int[] copies = {1,1,1,2,2,2,3,4,4,5,5,6,6,7};
        int[] set = {1,2,3,4,5,6,7};
        assertArrayEquals(set, myUtil.generateSet(copies));
    }

    @Test
    void testBiggerNumArray(){
        MathUtil myUtil = new MathUtil();
        int[] arr = {100, 4, 590, 230, 21};
        assertEquals(590, myUtil.biggestNumArray(arr));
    }

    @Test
    void testMinorNumArray(){
        MathUtil myUtil = new MathUtil();
        int[] arr = {100, 4, 590, 230, 21};
        assertEquals(4, myUtil.theMinorNumArray(arr));
    }

    @Test
    void testFillArr(){
        MathUtil myUtil = new MathUtil();
        int[] arr = new int[10];
        Arrays.fill(arr, 5);

        assertArrayEquals(arr, myUtil.fillArr(10, 5));
    }

    @Test
    void testCalcEvenNums(){
        MathUtil myUtil = new MathUtil();
        myUtil.calcEvenNumbers(10);
        int[] evens = {2,4,6,8,10};
        assertArrayEquals(evens, myUtil.getArrayResult());
    }

    @Test
    void testCalcOddNums(){
        MathUtil myUtil = new MathUtil();
        myUtil.calcOddNumbers(10);
        int[] odds = {1,3,5,7,9};
        assertArrayEquals(odds, myUtil.getArrayResult());
    }

    @Test
    void testCalcCousinNums(){
        MathUtil myUtil = new MathUtil();
        myUtil.calcCousinNumbers(10);
        int[] prime = {2,3,5,7};
        assertArrayEquals(prime, myUtil.getArrayResult());
    }

    @Test
    void testIsCapicua(){
        MathUtil myUtil = new MathUtil();
        String str = "12321";
        assertTrue(myUtil.isCapicua(str));
    }


}