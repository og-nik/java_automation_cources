import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by anna on 03.04.16.
 */
public class HomeWork4Ogorodnik {

    public static void main(String[] args) {

        // Reading from the properties file

        Properties applicationProps = new Properties();
        InputStream in = null;
        try {
            in = new FileInputStream("project.properties");
            applicationProps.load(in);
        } catch (FileNotFoundException fnfe){
            fnfe.printStackTrace();
        } catch (IOException ioe){
            ioe.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
        }

        String sentence = applicationProps.getProperty("sentence");
        System.out.println(sentence);

        String result = replaceGapsSort(sentence);
        System.out.println("Sorted array: " + result);

        String result2 = replaceGapsSort2(sentence);
        System.out.println("Sorted array: " + result2);

    }

    // Replace gaps with "-"
    // Sort words alphabetically case insensitive

    public static String replaceGapsSort(String str) {
        String result = "";
        String strIgnoreCase = str.toLowerCase();
        String[] wordsArray = strIgnoreCase.split(" ");
        Arrays.sort(wordsArray);
        for (int index = 0; index < wordsArray.length; index++){
            result += wordsArray[index] + "-";
        }
        return result.substring(0,result.length() - 1);
    }

    // Replace gaps with "-"
    // Sort words alphabetically (case insensitive)
    // Without using Arrays.sort(), using BubbleSort algorithm

    public static String replaceGapsSort2(String str) {
        String result = "";
        String strIgnoreCase = str.toLowerCase();
        String[] wordsArray = strIgnoreCase.split(" ");
        bubbleSort(wordsArray);
        for (int index = 0; index < wordsArray.length; index++){
            result += wordsArray[index] + "-";
        }
        return result.substring(0,result.length() - 1);
    }

    private static void bubbleSort(String[] wordsArray) {
        for (int barrier = wordsArray.length - 1; barrier > 0; barrier--){
            onePath(wordsArray, barrier);
        }
    }

    private static void onePath(String[] wordsArray, int barrier) {
        for (int i = 0; i < barrier; i++){
            if (wordsArray[i].compareTo(wordsArray[i + 1]) > 0){
                swapWords(wordsArray, i);
            }
        }
    }

    private static void swapWords(String[] wordsArray, int i) {
        String tmp = wordsArray[i];
        wordsArray[i] = wordsArray[i + 1];
        wordsArray[i + 1] = tmp;
    }

}
