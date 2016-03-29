package golovach;

import java.util.Arrays;

/**
 * Created by anna on 28.03.16.
 */
public class SelectSort {

    public static void main(String[] args) {

        int[] arr = {55,222,10,13,24,5,377,90};

        System.out.println(Arrays.toString(arr));

        int min = chooseMinimum(arr,0);

        System.out.println(min);

        selectSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectSort(int[] arr){
        for(int barrier = 0; barrier < arr.length; barrier++){
            int tmp = arr[barrier];
            int min = chooseMinimum(arr, barrier);
            int minIndex = Arrays.asList(arr).indexOf(min);
            arr[barrier] = min;
            arr[minIndex + 1] = tmp;
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
}

