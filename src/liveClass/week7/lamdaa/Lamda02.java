package liveClass.week7.lamdaa;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Lamda02 {

    /*
MAP - FOREACH FARKI:
map: Her bir elemanı dönüştürmek ve yeni bir Stream oluşturmak için kullanılır. Dönüştürülmüş elemanlarla yeni bir Stream döner.
forEach: Her bir eleman üzerinde işlem yapmak  için kullanılır, dönüşüm yapmaz ve yeni bir Stream oluşturmaz. Bir işlem yapar ve void döner,

 */

    // Task-1 : Functional Programming ile listin cift elemanlarinin  karelerini
    // ayni satirda aralarina bosluk bırakarak print ediniz
    public static void printNumbers5(ArrayList<Integer> list) {
        list.stream()
                .filter(Lamda01::ciftBul)
                .map(t -> t * t)
                .forEach(Lamda01::yazdir);
    }

    // Task-2: Functional Programming ile listin tek elemanlarinin  kuplerinin bir
    // fazlasini ayni satirda aralarina bosluk birakarak print ediniz
    public static void printNumbers6(ArrayList<Integer> list) {
        list.stream()
                .filter(t -> t % 2 != 0)
                .map(t -> (t * t * t) + 1)
                .forEach(Lamda01::yazdir);

    }

    //REDUCE
    //Task-4 : Listin en büyük elemanını yazdırınız
    public static void enBuyukEleman(ArrayList<Integer> list) {
        Optional<Integer> maxSayi = list.stream().reduce(Math::max);
        System.out.println(maxSayi);
    }

    //TASK-5 : Listin çifti elemanlrının  karelerinin en büyüğünü print ediniz,
    public static void enBuyukEleman2(ArrayList<Integer> list) {
        Optional<Integer> maxSayi = list.stream()
                .filter(Lamda01::ciftBul)
                .map(t -> t * t)

                .reduce(Math::min);

        System.out.println(maxSayi);
    }
    // Task-6: List'teki tum elemanlarin toplamini yazdiriniz.
    //1.yol
    public static void topla (ArrayList<Integer> list){
        int toplam = list.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(toplam);
    }
    //2.yol
    public static void topla2 (ArrayList<Integer> list){
        Optional<Integer> toplam = list.stream()
                .reduce(Integer::sum);
        System.out.println(toplam);
    }
    //TAsk -7: Listtteki çift elemanların çarpımını bul
    public static void carpma (ArrayList<Integer> list){
       Optional<Integer> result = list.stream().filter(Lamda01::ciftBul)
                .reduce(Math::multiplyExact);
        System.out.println(result);
    }
    public static void carpma2 (ArrayList<Integer> list){
        int result = list.stream().filter(Lamda01::ciftBul)
                .reduce(1,(a,b)->a*b);
        System.out.println(result);
    }
    // Task-10 : list'in cift  elemanlarinin karelerini  kucukten buyuge print ediniz.
   public static void sirala(ArrayList<Integer> list){
        list.stream()
                //.filter(Lamda01::ciftBul)
                //.map(t->t*t)
                .sorted(Comparator.reverseOrder())
                .forEach(Lamda01::yazdir);
   }
}
