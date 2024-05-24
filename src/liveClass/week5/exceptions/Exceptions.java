package liveClass.week5.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println("uygulama başladı");
        int a =12;
        int b = 6;
        try {
            System.out.println(a/b);
            System.out.println("işlem yapılıyor");
        }catch (Exception e){
            System.out.println("exception handled");
        }finally {
            System.out.println("finally çalıştı");
        }


        System.out.println("uygulama bitti");
    }
}
