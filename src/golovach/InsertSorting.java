package golovach;

import java.util.Arrays;

/**
 * Created by anna on 30.03.16.
 */
public class InsertSorting {

    public static void main(String[] args) {

        InsertSorting test = new InsertSorting();

        int[] arr = {22,3,5,0,1,1,100,5};
        System.out.println(Arrays.toString(arr));

        test.insertSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public int[] insertSort(int[] arr){
        int[] result = {};
        for (int barrier = 0; barrier < arr.length; barrier++){
            result = placeInCorrectOrder(arr, barrier);
        }
        return result;
    }

    public int[] placeInCorrectOrder(int[] arr, int barrier){
        int index = 0;
        int[] sortedPart = {};
        while (index <= barrier){
            // binary search ??

            if (arr[index] > arr[index + 1]){
                int tmp = arr[index];
                arr[index] = arr[index + 1];
                arr[index + 1] = tmp;
            }
            index++;
        }
        return sortedPart;

    }
}
