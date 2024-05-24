package liveClass.week4.stringManipulations;

import java.util.Arrays;
import java.util.Comparator;

public class StringManipulations2 {
    public static void main(String[] args) {
        //replace();
        String str = "Ali okula gitti.";
        String strNew =  str.replace("a","*");
        //System.out.println(strNew);
        //System.out.println(str);
        ////sour-2) bir stringdeki tüm a harflerini“*”  a  çeviriniz
        String str1 = "Işık ılık süt iç";
        //System.out.println(str1.replace("ık", "*"));

        //indexOf -- lastIndexOf()
        //System.out.println(str1.indexOf("ı"));
        //System.out.println(str1.lastIndexOf("ı"));

        //Example-- Bir String'deki bir character'in tekrarli
         // veya tekrarsız olup olmadigini gosteren kodu yaziniz

        String str2 = "Hello";
        char c = 'o';
        /*if (str2.indexOf("o")==str2.lastIndexOf("o")) {
            System.out.println("tekrarsızdır");
        }else System.out.println("tekrarlıdır");*/

        //isEmpty() -- isBlank()
        String str3 = " ";
        //System.out.println("isEmpty : "+str3.isEmpty());
        //System.out.println("isBlank : "+str3.isBlank());

        //concat()
        String str4 = "Mesut";
        String str5 = " Erdem";
        //System.out.println(str4+str5);
        //System.out.println(str4.concat(str5));

        // Verilen bir cümlede ki en uzun kelimeyi bulan kodu yaziniz
        String sentence = "Benden sonra beni benimsemek isteyenler bu temel " +
                "mihver üzerinde aklın ve bilimin rehberliğin kabul ederlerse " +
                "manevi mirasçılarım olurlar";
        String[] arr = sentence.split(" ");
        System.out.println(Arrays.toString(arr));
        String enUzun = "";
        int len=0;
        for (String w : arr){
               if (w.length()>len){
                   len=w.length();
                   enUzun=w;
               }
        }
        System.out.println("en uzun kelime : "+enUzun);
        //2yol;
        //BEST PRACTICE
        Arrays.sort(arr, Comparator.comparing(String::length));
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[arr.length-1]);






    }
}