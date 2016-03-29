import java.util.Arrays;

/**
 * Created by anna on 26.03.16.
 */
public class ArraysMy {

    public static void main(String[] args) {

        double[] arr = {77,5,77,1,10};
        double sum = 0;

        // count summ
        for(double d : arr){
            sum += d;
        }
        System.out.println("Summ = " + sum);

        // find element in massive
        double number = 77;
        boolean found = false;

        for(double d : arr){
            if(d == number){
                found = true;
            }

        }
        if (found){
            System.out.println("We have " + number + " in array");
        }else{
            System.out.println("No such number in array");
        }

        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
}
