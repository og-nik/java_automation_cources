package golovach;

import java.util.Arrays;

/**
 * Created by anna on 27.03.16.
 */
public class TestMerger {

    public static void main(String[] args) {

        int[][][] data = {
                {{},{}},
                {{},{0}},
                {{0},{}},
                {{0},{0}},
                {{1,10},{3,6}},
                {{4,5,8,12,90},{3,6,30,45}},

        };

        for(int[][] origin: data){
            int[] left = origin[0];
            int[] right = origin[1];
            int[] merged = Merger.merge(left,right);
            System.out.println(
                    Arrays.toString(left) +
                            " + " +
                    Arrays.toString(right) +
                            " --> " +
                    Arrays.toString(merged));

            System.out.println();
        }


    }
}
