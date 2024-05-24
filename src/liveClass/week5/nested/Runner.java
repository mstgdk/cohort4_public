package liveClass.week5.nested;

public class Runner {
    public static void main(String[] args) {
        A a1 = new A();
        System.out.println(a1.a);

        A.B b1 = new A.B();
        System.out.println(b1.a);
    }
}
