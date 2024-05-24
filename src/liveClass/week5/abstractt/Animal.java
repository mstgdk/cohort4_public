package liveClass.week5.abstractt;

public abstract class Animal {
    //1. body'si olmayan method'lar "abstract method" olarak adlandirilir

    /*2.Bir method'u abstract yapmak icin;
     i)Method body'i sil
     ii)"abstract" keyword kullan


    //"abstract method" lar "abstract class" icinde olmalidir.*/

    public abstract void move();
    public abstract void eat();

    //Parent abstract class'inda "abstract method" lar varsa
//i)Child Class'i abstract yapmalisiniz veya
//ii)Parent Class'daki tum "abstract method" lari override etmelisiniz

    /*
    Abstract olmayan metotlara "concrete metot" denir
     */

}
