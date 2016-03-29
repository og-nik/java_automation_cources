/**
 * Created by anna on 26.03.16.
 */
public class Car {

    int doorsNumber = 0;
    String color = " ";
    int year = 0;

    public Car(int doorsNumber, String color, int year){
        this.doorsNumber = doorsNumber;
        this.color = color;
        this.year = year;
    }

    public Car(){

    }

    public int getDoorsNumber(){
        return doorsNumber;
    }

    public String getColor(){
        return color;
    }

    public int getYear(){
        return year;
    }

    public void setDoorsNumber(int doorsNumber){
        this.doorsNumber = doorsNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String go(){
        return "Go!!";
    }

    public void stop(){
        System.out.println("Stop!!");
    }
}
