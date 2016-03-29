package golovach;

/**
 * Created by anna on 27.03.16.
 */
public class Merger {

    public static int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while(aIndex + bIndex != result.length){
            if (aIndex < a.length && bIndex < b.length) {
                if (a[aIndex] < b[bIndex]) {
                    result[aIndex + bIndex] = a[aIndex++];
                } else {
                    result[aIndex + bIndex] = b[bIndex++];
                }
            } else {
                if (aIndex >= a.length){
                    for(int i = bIndex; i < b.length; i++){
                        result[a.length + i] = b[i];
                    }
                } else if (bIndex >= b.length){
                    for(int i = aIndex; i < a.length; i++){
                        result[b.length + i] = a[i];
                    }
                }
            }
        }

        return result;
    }
}
