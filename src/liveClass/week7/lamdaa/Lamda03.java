package liveClass.week7.lamdaa;

import java.util.Comparator;
import java.util.List;

public class Lamda03 {
    //TASK-1: List elemanlarını alfabetik, byüyük harf ve tekrarsız print ediniz
    public static void printNames1(List<String> list) {
        list.stream()
                .map(String::toUpperCase)
                .sorted()
                .distinct()
                .forEach(Lamda01::yazdir);
    }

    // Task -2 : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void printNames2(List<String> list) {
        list.stream()
                .map(String::length)    //4,4,4,5,5,5,11
                .sorted(Comparator.reverseOrder())
                .distinct()
                .forEach(Lamda01::yazdir);
    }
    // *********************** anyMatch() *** allMatch() **** noneMatch() ************************
    //anyMatch() --> en az bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch()--> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.


    // Task-4 : List elelmmalarinin hepsinin karakter sayisinin 4 ve 4 'den az olma durumunu kontrol ediniz.
    public static void harfSayisi4denAz(List<String> list) {
        System.out.println(list.stream().allMatch(t -> t.length() <= 11));
    }

    public static void harfSayisi11denAz(List<String> list) {
        String str = list.stream().allMatch(t -> t.length() <= 10) ? "list elemanları 11den küçük" : " 11den büyük ";
        System.out.println(str);
    }

    ///// Task-5 : List elelmanlarinin hepsinin "w" ile baslamasını noneMatch() ile kontrol ediniz.
    public static void wIleBaslayan(List<String> list) {
        System.out.println(list.stream()
                .noneMatch(t -> t.startsWith("y")));
    }

    // Task-6 : List elelmanlarinin "x" ile biten en az bir elemanı kontrol ediniz.
    public static void xIleBiten(List<String> list) {
        System.out.println(list.stream()
                .anyMatch(t -> t.endsWith("e")));

    }
    //limit
    public static void limit(List<String> list){
        list.stream().limit(3).forEach(Lamda01::yazdir);
    }
    //count
    public static void count(List<String> list){
        System.out.println("list.stream().count() = " + list.stream().count());
    }
    //skip
    public static void skip(List<String> list){
        list.stream().skip(3).forEach(Lamda01::yazdir);
    }
}