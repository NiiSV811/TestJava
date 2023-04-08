package co.edu.uptc.sorting;
import  co.edu.uptc.mathutil.MathUtil;
public class SortingAlgorithms {
    private final MathUtil math;
    public SortingAlgorithms(){
        this.math = new MathUtil();
    }

    public int[] bubbleSort(int[] arr){
        int[] sorted = arr;
        int limit = sorted.length -1;
        for(int i = 0; i < limit; i++){
            for(int j = 0; j < limit - i; j++){
                if( sorted[j] > sorted[j+1]){
                    int temp = sorted[j+1];
                    sorted[j+1] = sorted[j];
                    sorted[j] = temp;
                }
            }
        }
        return sorted;
    }

    public int[] countingSort1(int[] arr){
        int maxValue = this.math.biggestNumArray(arr);
        int[] countArr = this.math.fillArr(maxValue + 1, 0);
        int[] outputArr = new int[arr.length + 1];
        for(int i = 1; i < countArr.length; i++){
            countArr[i] = this.math.countElementArray(i, arr);
        }

        for (int i = 1; i < countArr.length; i++){
            countArr[i] += countArr[i-1];
        }

        for(int i = 0; i < arr.length; i++){
            int index = countArr[arr[i]] - 1;
            outputArr[index] = arr[i];
            countArr[arr[i]] -= 1;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = outputArr[i];
        }
        return arr;
    }

    public int[] insertionSort(int[] arr){
        int key = 0;
        int j = 0;
        for (int i = 1; i < arr.length; i++){
            key = arr[i];
            j = i - 1;

            while (j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = key;
        }

        return arr;
    }


}

