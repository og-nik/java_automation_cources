/**
 * Created by anna on 30.03.16.
 */
public class ReferencesTest {

    public static void main(String[] args) {

        ClassA x = new ClassA();
        ClassA y = new ClassA();



        System.out.println(x.testField);
        System.out.println(y.testField);

        swap (x, y);
        System.out.println(x.testField);
        System.out.println(y.testField);

    }

    public static void swap (ClassA a, ClassA b){
        ClassA temp = a;
        a = b;
        b = temp;
        b.testField = 5;
    }
}
