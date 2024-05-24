package liveClass.week4.stringManipulations;

public class StringRegex {
    public static void main(String[] args) {
        /*"Regex" Regular Expressions
        1) Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler==> [a-z]
        3)tüm büyük harfler==> [A-Z]
        4)tüm harfler ==> [a-zA-Z]
        5)Sesli harfler ==> [aeiouAEIOU]
        6) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        7) Space ==> [ ]
        8) Tüm noktalama işaretleri     \\p{Punct}

        1)Rakamlar hariç tüm karakterler ==> [^0-9]
        2) Küçük harfler hariç tüm karakterler ==> [^a-z]
        3)büyük harfler hariç tüm karakterler==> [^A-Z]
        4)tüm harfler hariç tüm karakterler ==> [^a-zA-Z]
         5) Space hariç tüm karakterl ==> [^ ]

*/
        /*Example : Bir password'un gecerli olmadigini asagidaki kurallara gore test eden kodu yaziniz
         //  i)Space haric en az sekiz karakter olmali
         //  ii)En az 1 sembol icermeli
         //  iii)En az 1 rakam icermeli
         //  iv)En az 1 buyuk harf icermeli
         //  v)En az 1 kucuk harf içermeli
*/

        String pwd = "B78cuyuyKm-";
        //  i)Space haric en az sekiz karakter olmali
        boolean first = pwd.replaceAll(" ","").length()>=8;
        //  ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("^\\p{Punct}","").length()>=1;
        //  iii)En az 1 rakam icermel
        boolean third= pwd.replaceAll("\\D","").length()>=1;
        //  iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>=1;
        //  v)En az 1 kucuk harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>=1;

        System.out.println(first&&second&&third&&fourth&&fifth);


        String str = "B78cuyu*-yKm-";
        System.out.println(str.replaceAll("\\D","*"));
    }
}
