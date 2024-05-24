package liveClass.week4.override;

public class Mammal extends Animal {
    String a = "mammal";
    String b="mamalB";

    public void feedWithMilk(){
        System.out.println("feedWithMilk çalıştı");
    }
    public void move(){
        System.out.println("Mammal moved");
    }
    public Mammal() {
       // System.out.println("MAmmal constructor çalıştı");

    }
}
