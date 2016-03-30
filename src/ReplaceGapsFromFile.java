import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by anna on 30.03.16.
 */
public class ReplaceGapsFromFile {

    public static void main(String[] args) throws IOException {

        Properties applicationProps = new Properties();
        InputStream in = new FileInputStream("project.properties");
        applicationProps.load(in);
        in.close();

        String sentence = applicationProps.getProperty("sentence");
        System.out.println(sentence);

        String result = replaceGaps(sentence);
        System.out.println(result);

        String result2 = reverseWordsOrder(result);
        System.out.println(result2);

        System.out.println();
        System.out.println();
        try {
            String res3 = reverseOrNot(sentence, true);
            System.out.println(res3);
        }catch (TooManyWordsException tme){
            tme.printStackTrace();
        }

    }

    // Replace gaps with "-"
    public static String replaceGaps(String str){
        String result = "";
        String[] splitedStr = str.split(" ");
        for (int index = 0; index < splitedStr.length; index++){
            result += splitedStr[index] + "-";
        }
        return result.substring(0, result.length() - 1);
    }

    // Replace gaps with "-" and put words in back order
    public static String reverseWordsOrder(String str){
        String result = "";
        String[] splitedStr = str.split("-");
        for (int index = splitedStr.length - 1; index >= 0; index--){
            result += splitedStr[index] + "-";
        }
        return result.substring(0, result.length() - 1);
    }

    // Reverse words order or not depends on boolean parameter
    public static String reverseOrNot (String str, boolean reverse) throws TooManyWordsException {
        String result = "";
        String[] splitedStr = str.split(" ");
        if (splitedStr.length >= 5){
            throw new TooManyWordsException(str);
        }
        if (reverse == true){
            for (int index = splitedStr.length - 1; index >= 0; index--){
                result += splitedStr[index] + "-";
            }
            return result.substring(0, result.length() - 1);
        } else {
            for (int index = 0; index < splitedStr.length; index++){
                result += splitedStr[index] + "-";
            }
            return result.substring(0, result.length() - 1);
        }
    }
}
