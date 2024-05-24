package liveClass.week4.inheritance;

public class Runner {
    public static void main(String[] args) {
       Cat c1 = new Cat();
        //System.out.println(c1.a);
        //System.out.println(c1.b);

        Mammal c2 = new Cat();
        System.out.println(c2.a);
        c2.move();
        System.out.println(c2.c);


    }
}
