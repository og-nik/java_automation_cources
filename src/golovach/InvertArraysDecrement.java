package golovach;

import java.util.Arrays;

/**
 * Created by anna on 27.03.16.
 */
public class InvertArraysDecrement {

    public static void main(String[] args) {

        //int[] a = {33,4,0,5,1}; //odd
        int[] a = {33,4,0,5,1,2}; //even
        // int[] a = {1};
        // int[] a = {};

        System.out.println(Arrays.toString(a));

        // Inverting with decrement
        for (int index = a.length / 2 - 1; index >= 0; index--){
            int tmp = a[index];
            a[index] = a[a.length - index - 1];
            a[a.length - index - 1] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
