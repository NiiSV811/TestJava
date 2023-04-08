package co.edu.uptc.sorting;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {


    @Test
    void bubbleSort() {
        SortingAlgorithms mySort = new SortingAlgorithms();
        int[] arr = {3,5,6,7,2,1};
        int[] arrToSort = {3,5,6,7,2,1};
        Arrays.sort(arr);
        assertArrayEquals(arr, mySort.bubbleSort(arrToSort));
    }

    @Test
    void countingSort1() {
        SortingAlgorithms mySort = new SortingAlgorithms();
        int[] arr = {3,5,6,7,2,1};
        int[] arrToSort = {3,5,6,7,2,1};
        Arrays.sort(arr);
        assertArrayEquals(arr, mySort.countingSort1(arrToSort));
    }

    @Test
    void insertionSort() {
        SortingAlgorithms mySort = new SortingAlgorithms();
        int[] arr = {3,5,6,7,2,1};
        int[] arrToSort = {3,5,6,7,2,1};
        Arrays.sort(arr);
        assertArrayEquals(arr, mySort.insertionSort(arrToSort));
    }
}