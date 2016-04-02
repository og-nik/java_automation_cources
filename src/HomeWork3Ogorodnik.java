import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by anna on 31.03.16.
 */
public class HomeWork3Ogorodnik {

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

        String result = replaceGapsShowEvensOnly(sentence);
        System.out.println("Result: " + result);

    }

    // Replace gaps with "-"
    // Output only words with even number of symbols

    public static String replaceGapsShowEvensOnly(String str) {
        String result = "";
        String[] splitedStr = str.split(" ");
        for (int index = 0; index < splitedStr.length; index++) {
            char[] oneWord = splitedStr[index].toCharArray();
            if (oneWord.length % 2 == 0){
                result += splitedStr[index] + "-";
            }
        }
        return result.substring(0,result.length() - 1);
    }

    }
