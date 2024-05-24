package liveClass.week5.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {//Natural order- doğal sıralama- çok yavaştır
        TreeSet<String> lhast=new TreeSet<>();
        lhast.add("Yakup");
        lhast.add("Emir");
        lhast.add("Okan");
        lhast.add("Cihan");
        lhast.add("Mesut");
        lhast.add("Mesut");
        lhast.add("Mesut");
        System.out.println(lhast);


        //İlla Treemap işle çalışacaksak, yavaşlık problemini ortadan kaldırmak için;
        Set<String> hashSet = new HashSet<>();//Hash bir tekniktir. Java kendi biçimine göre sıralar(rastgele). Çok hızlıdır
        hashSet.add("Yakup");
        hashSet.add("Emir");
        hashSet.add("Okan");
        hashSet.add("Cihan");
        hashSet.add("Mesut");

        TreeSet<String> fastTreeSet=new TreeSet<>(hashSet);
        System.out.println(fastTreeSet);




    }
}
