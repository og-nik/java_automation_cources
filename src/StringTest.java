import java.util.Arrays;

/**
 * Created by anna on 28.03.16.
 */
public class StringTest {

    public static void main(String[] args) {

        String palindrome = "Good Morning!";

        System.out.println(palindrome);
        System.out.println(palindrome.length());

        String newPalindrome = "Anna, " + palindrome;
        System.out.println(newPalindrome);

        String tp = String.valueOf(18.3);
        System.out.println(tp);

        System.out.println();
        System.out.println();
        System.out.println();
        String s = replaceGaps("Hello World!");
        System.out.println(s);
    }


    public static String replaceGaps(String str){
        String result = "";
        String[] splitedStr = str.split(" ");
//        System.out.println(Arrays.toString(splitedStr));
        for (int index = 0; index < splitedStr.length; index++){
            result += splitedStr[index] + "/";
        }
        return result.substring(0, result.length() - 1);
        }


}
