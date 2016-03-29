/**
 * Created by anna on 26.03.16.
 */
public class CarTest {

    public static void main(String[] args) {

        Car C1 = new Car(4,"yellow",2006);
        Car C2 = new Car();
        Car C3 = new Car(2,"red",2003);

        C2.setColor("green");
        C3.getColor();
        System.out.println(C2.getColor());
        System.out.println(C3.getColor());
        System.out.println(C1.getDoorsNumber());

        System.out.println(C2.go());
        C2.stop();

    }
}
