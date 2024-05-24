package liveClass.week4.stringManipulations;

public class StringRegex2 {
    public static void main(String[] args) {
        //regex
        /*
        1) Tüm rakamlar ==> [0-9]
        2)Tüm küçük harfler==> [a-z]
        3)tüm büyük harfler==> [A-Z]
        4)tüm harfler ==> [a-zA-Z]
        5)Sesli harfler ==> [aeiouAEIOU]
        6) Tüm rakamlar ve tüm harfler ==> [0-9a-zA-Z]
        7) Space ==> [ ]
        8) Tüm noktalama işaretleri     \\p{Punct}
        //----------------
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
        String pwd = "7lklklklklom*";
        //  i)Space haric en az 8 karakter olmali
        boolean first = pwd.replace(" ","").length()>=8;
        //  ii)En az 1 sembol icermeli
        boolean second = pwd.replaceAll("[0-9a-zA-Z]","").length()>=1;
        //  iii)En az 1 rakam icermeli
        boolean  third = pwd.replaceAll("\\D","").length()>=1;
        //  iv)En az 1 buyuk harf icermeli
        boolean fourth = pwd.replaceAll("[^A-Z]","").length()>=1;
        //  v)En az 1 kucuk harf içermeli
        boolean fifth = pwd.replaceAll("[^a-z]","").length()>=1;

        System.out.println(first && second && third && fourth && fifth );

        // kısa yollar /*
        /*

1)   \\d    ==> tum rakamlar
      \\D    ==> tum rakam disi character ler
2)   \\w   ==> A->Z     a->z         0->9    _tum buyuk, kucuk harf ve rakamlar
      \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3)   \\s   ==> space tum bosluklar
      \\S   ==> space disindaki hersey

         */

    }
}
