package golovach;

import java.util.Arrays;

/**
 * Created by anna on 26.03.16.
 */
public class InvertArrays {

    public static void main(String[] args) {

        int[] array = {2,5,7,4,90,1,0}; //odd
        //int[] array = {2,5,7,4,90,1,0,100}; // even
        //int[] array = {1};
        //int[] array = {};

        System.out.println(Arrays.toString(array));

        /**
        // Display the elements of the array in opposite order
        // 1 way - create new array
        int[] array0 = new int[array.length];

        for(int index = 0; index < array.length; index++){
            array0[index] = array[array.length - 1 -index];

        }

        System.out.println(Arrays.toString(array0));

         */

        // 2 way - in place (without creating of new array)
        for(int index = 0; index < array.length / 2; index++){
            int tmp = array[index];
            array[index] = array[array.length - 1 -index];
            array[array.length - 1 -index] = tmp;
        }

        System.out.println(Arrays.toString(array));
    }
}
