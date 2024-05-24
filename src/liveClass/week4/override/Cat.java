package liveClass.week4.override;

public class Cat extends Mammal {
    String a = "cat";

    @Override
    public int add(int a, int b) {
        return a-b;
    }

    public void meaw(){
        System.out.println("Kedi meaw dedi");
    }
    /*public void move(){
        System.out.println("Cat moved");
    }*/
    public Cat() {
        //super();//paren classının parameteresiz constrc. git.
        //System.out.println("Cat constructor çalıştı");
    }


}
