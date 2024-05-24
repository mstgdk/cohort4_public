package liveClass.week4.constructorCall;

public class Vehicle {
/*
CLASS FINAL YAPILIRSA NE OLUR?
Final Class'larda kullanılabilir
	Bir Class "final" ise o Class kısırlaştırılmıştır.
	Bir Class "final" ise o Class'a extends edilemez.
	"final" Class child olabilir.

 */


    public String type;

    public Vehicle(){

    }
    public Vehicle(String type){//Car
        this.type = type;
        System.out.println("Vehicle Constructor");
    }
}
