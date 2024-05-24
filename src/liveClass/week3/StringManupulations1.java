package liveClass.week3;

import java.util.Arrays;
import java.util.Comparator;

public class StringManupulations1 {
    public static void main(String[] args) {
        //replace()
        //soru) Bir Stringde space hariç kaç tane karakter kullanıldığını gösteren kodu yazınız
        String str = "Ali okula gitti.";
        System.out.println(str.replace(" ", "").length());

        //sour-2) bir stringdeki tüm a harflerini “*”  a  çeviriniz
        String str2 = "Ankara'nın taşına gözlerimin yaşına bak";
        System.out.println(str2.replace("ş", "*"));
        //indexOf()--lastIndexOf()
        String str3 = "Java is easy";
        System.out.println(str3.indexOf("a"));
        System.out.println(str3.lastIndexOf('a'));

        //Example-- Bir String'deki bir character'in tekrarli
        // veya tekrarsız olup olmadigini gosteren kodu yaziniz

        String str4 = "Hello";
        char c = 'o';
        if (str4.indexOf("o") == str4.lastIndexOf("o")) {
            System.out.println("tekrarsız");
        } else System.out.println("tekrarlı");

        //isEmpty() - isBlank()
        String str5 = " ";
        System.out.println(str5.isBlank());
        System.out.println(str5.isEmpty());

        //concat()
        System.out.println(str3 + str4);
        System.out.println(str3.concat(str4));


        // Verilen bir cümlede ki en uzun kelimeyi bulan kodu yaziniz
        String sentence = "Benden sonra beni benimsemek isteyenler" +
                " bu temel mihver üzerinde aklın ve bilimin rehberliğin kabul" +
                " ederlerse manevi mirasçılarım olurlar";
        String[] arr = sentence.split(" ");
        //System.out.println(Arrays.toString(arr));
        String enUzun = "";
        int macLength = 0;
        for (String w : arr) {
            if (w.length() > macLength) {
                macLength = w.length();
                enUzun = w;
            }
        }
        System.out.println("enUzun = " + enUzun);
        //-------------2.yol
        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(arr[arr.length-1]);

    }
}
