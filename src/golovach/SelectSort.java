package golovach;

import java.util.Arrays;

/**
 * Created by anna on 28.03.16.
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {55,222,10,2};
        System.out.println(Arrays.toString(arr));

        int min = chooseMinimum(arr,0);
        System.out.println(min);

        int minIndex = findIndex(arr,min);
        System.out.println(minIndex);

        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Sortirovka vuborkami

    private static void selectSort(int[] arr){
        for(int barrier = 0; barrier < arr.length; barrier++){
            int min = chooseMinimum(arr, barrier);
            int minIndex = findIndex(arr, min);
            int tmp = arr[barrier];
            arr[barrier] = min;
            arr[minIndex] = tmp;
        }
    }

    private static int chooseMinimum(int[] arr, int barrier){
        int index = barrier;
        int min = arr[barrier];
        while(index < arr.length - 1){
            if (min > arr[index + 1]){
                min = arr[index + 1];
            }
            index++;
        }
        return  min ;
        }

    private static int findIndex(int[] arr, int min){
        int minIndex = 0;
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i] == min){
                minIndex = i;
                break;
            }
        }
        return minIndex;
    }
}

