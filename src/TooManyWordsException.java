/**
 * Created by anna on 30.03.16.
 */
public class TooManyWordsException extends Exception {

    public TooManyWordsException(String sentence){
        super("Too many words in the sentence: " + sentence);
    }
}
