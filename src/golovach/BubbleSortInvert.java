package golovach;

import java.util.Arrays;

/**
 * Created by anna on 28.03.16.
 */
public class BubbleSortInvert {

    public static void main(String[] args) {

        int[] array = {10,167,5,190,4,0,0,0,67,67};

        System.out.println(Arrays.toString(array));

        bubbleSort(array);

        System.out.println(Arrays.toString(array));


    }

    private static void bubbleSort(int[] arr){
        for(int barrier = 0; barrier < arr.length; barrier++){
            onePath(arr, barrier);
        }
    }

    private static void onePath(int[] arr, int barrier) {
        for(int index = arr.length - 1 ; index >= barrier + 1; index--){
            conditionalSwap(arr, index);
        }
    }

    private static void conditionalSwap(int[] arr, int index) {
        if (arr[index] < arr[index - 1]){
            swapElements(arr, index);
        }
    }

    private static void swapElements(int[] arr, int index) {
        int tmp = arr[index];
        arr[index] = arr[index -1];
        arr[index - 1] = tmp;
    }
}
