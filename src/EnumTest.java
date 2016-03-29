/**
 * Created by anna on 28.03.16.
 */
public class EnumTest {

    public static void main(String[] args) {

        TestStatus ts = TestStatus.ABORTED;

        if (ts == TestStatus.ABORTED){
            System.out.println("TC is aborted.");
        }

        System.out.println(ts.canContinue());

        Character c = 'c';
        System.out.println(Character.isLowerCase('c'));



    }
}
