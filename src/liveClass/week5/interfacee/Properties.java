package liveClass.week5.interfacee;

public interface Properties {

    int a=12;
    //"fully abstraction"
    void run();

    //Eğer body si olan metot kullanmak istersek
    //1 "default" keywor
    //2 "static" keyword
    default void concreteMethot(){
        System.out.println("default metoto çalıştı");
    }
    static void concreteMethot2(){
        System.out.println("static metoto çalıştı");
    }


}
