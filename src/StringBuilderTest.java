/**
 * Created by anna on 28.03.16.
 */
public class StringBuilderTest {

    public static void main(String[] args) {

        StringBuilder s = replaceGaps(args[0]);
        System.out.println(s);
    }

    public static StringBuilder replaceGaps(String str){
        String[] splitedStr = str.split(" ");
        StringBuilder sb = new StringBuilder();
//        System.out.println(Arrays.toString(splitedStr));
        for (int index = 0; index < splitedStr.length; index++){
            sb.append(splitedStr[index] + "/");
        }
        return sb.replace(sb.length() - 1,sb.length(), "");
    }

}
