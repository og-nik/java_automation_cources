/**
 * Created by anna on 27.03.16.
 */
public class HomeWork2Ogorodnik {

    public static void main(String[] args) {

        //int[] a = {1,2,3};
        //int[] b = {1,2,3};

        int[] a = {1,2,6,7};
        int[] b = {4,2,6,7};

        //int[] a = {1,2};
        //int[] b = {1,2,3};

        //int[] a = {};
        //int[] b = {};

        // The code below verifies if the arrays are equal
        boolean equal = false;

        // The case when arrays are null
        if (a == null || b == null){
            equal = false;
            // Verify if the arrays have the same length
        } else if (a.length != b.length){
            equal = false;
            System.out.println();
            // Verify if the arrays are equal
        } else {
            for(int i = 0; i < a.length; i++){
                if(a[i] == b[i]){
                    equal = true;
                } else {
                    equal = false;
                }
            }
        }
        // Write results
        if(equal == true){
            System.out.println("Arrays are equal");
        } else {
            System.out.printf("Arrays are not equal");
        }
    }
}
