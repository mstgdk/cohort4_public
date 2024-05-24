package liveClass.week4.constructorCall;

public class Car extends Vehicle{

    public String color;
    int km;

    public Car(){

    }

    public Car(String color, int km){//white 540000
        super("Car");
        this.color = color;
        this.km = km;
        System.out.println("Car Constructor");
    }
}
