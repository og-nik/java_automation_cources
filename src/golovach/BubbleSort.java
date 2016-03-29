package golovach;

import java.util.Arrays;

/**
 * Created by anna on 27.03.16.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = {10,1,0,30,67,6,100,23};

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int barrier = arr.length - 1; barrier >= 0; barrier--){
            onePath(arr, barrier);
        }
    }

    private static void onePath(int[] arr, int barrier) {
        for (int index = 0; index < barrier; index++){
            conditionalSwapElements(arr, index);
        }
    }

    private static void conditionalSwapElements(int[] arr, int index) {
        if(arr[index] > arr[index + 1]){
            swapElements(arr, index);
        }
    }

    private static void swapElements(int[] arr, int indexFrom) {
        int indexTo = indexFrom + 1;
        int tmp = arr[indexFrom];
        arr[indexFrom] = arr[indexTo];
        arr[indexTo] = tmp;
    }
}
