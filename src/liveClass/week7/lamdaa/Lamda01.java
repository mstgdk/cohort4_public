package liveClass.week7.lamdaa;

import java.util.ArrayList;
import java.util.List;

public class Lamda01 {
    //lamda
    //StreamAPI -- java8
    // collections ve Arraylerde kullanılır. MAp de kullanılmaz.
    public static void printNumbers(ArrayList<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");
        }
    }

    //foreach
    public static void printNumbers2(ArrayList<Integer> list) {
        list.stream().forEach(t -> System.out.print(t + " "));
    }

    public static void printNumbers3(ArrayList<Integer> list) {
        list.stream().forEach(System.out::println);//method reference ->tercihen bu kullanılmalı
    }

    public static void yazdir(int a) {
        System.out.print(a + " ");
    }
    public static void yazdir(String a) {
        System.out.print(a + " ");
    }

    public static void printNumbers4(ArrayList<Integer> list) {
        list.stream().forEach(Lamda01::yazdir);
    }

    //TASK  : functional Programming ile list elemanlarinin  cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz.
    public static void printCiftNumbers(ArrayList<Integer> list) {
        list.stream()
                .filter(t -> t % 2 == 0)
                .forEach(Lamda01::yazdir);
    }

    // Yukarıdaki TAsk filter() kısmını method referenca ile yapınız
    public static boolean ciftBul(int a) {
        return a % 2 == 0;
    }

    public static void printCiftNumbers2(ArrayList<Integer> list) {
        list.stream()
                .filter(Lamda01::ciftBul)
                .forEach(Lamda01::yazdir);
    }
    // TASK  : functional Programming ile list elemanlarinin 10 dan küçük cift olanlarini ayni satirda aralarina bosluk birakarak print ediniz
    public static void printCiftNumbers3(ArrayList<Integer> list) {
        list.stream()
                .filter(t-> t%2==0 && t<10)
                .forEach(Lamda01::yazdir);

    }


}
