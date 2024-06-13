package liveClass.week7.lamdaa;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Lamda04 {
    //task 01--> Bütün üniversitelerin not ortalamalarının 74' den buyuk olup olmadığını kontrol edeniz.
    public static boolean university1(List<University> list){
       return list.stream()
                .allMatch(t->t.getNotOrt()>74);

    }
    //TASK-2: Üniversitelerin her hangibirinde matematik bölümü olup olmadığını kontrol eden kod yazın
    public static boolean university2(List<University> list){
        return list.stream().anyMatch(t->t.getBolum().contains("matematik"));

    }
    //task 03-->universite'leri ögrenci  sayilarina gore büyükten->küçüpe sıralayınız.
    public static List<University> unvSirala(List<University> list){
       return list.stream()
                .sorted(Comparator.comparing(University::getOgrSyisi).reversed())
                .collect(Collectors.toList());
    }
    // TASK-4 : Kaç tane üniversitede MAtematik bölümü olduğunu yazdırınız
    public static long university3(List<University> list){
       return list.stream().
                filter(t->t.getBolum().contains("mat"))
                .count();

    }
    //TASK 5 : Öğrenci sayıları 550 den fazla olan üniversitelerin lerden en yüksek not ortalamasını bulunuz
    public static Optional<Integer> university4(List<University> list){
        return list.stream()
                .filter(t->t.getOgrSyisi()>550)
                .map(t->t.getNotOrt())
                .reduce(Math::min);
    }

}
