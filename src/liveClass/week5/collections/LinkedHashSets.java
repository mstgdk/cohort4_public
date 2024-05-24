package liveClass.week5.collections;

import java.util.LinkedHashSet;

public class LinkedHashSets {
    public static void main(String[] args) {//giriş sırasına göre eleeman ekler. HAshSet lere göre daha yavaştır
        LinkedHashSet<String> lhast=new LinkedHashSet<>();
        lhast.add("Yakup");
        lhast.add("Emir");
        lhast.add("Okan");
        lhast.add("Cihan");
        lhast.add("Mesut");
        lhast.add("Mesut");
        lhast.add("Mesut");
        System.out.println(lhast);
    }
}
