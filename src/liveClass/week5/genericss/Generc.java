package liveClass.week5.genericss;

public class Generc<T> {
    T type;

    public Generc(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        Generc<String> g1 = new Generc<>("string tipi");
        System.out.println("g1.type = " + g1.type);

        Generc<Integer> i1 = new Generc<>(13);
        System.out.println(i1.type);
    }

}
