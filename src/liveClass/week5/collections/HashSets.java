package liveClass.week5.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSets {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();//Hash bir tekniktir. Java kendi biçimine göre sıralar(rastgele). Çok hızlıdır
        hashSet.add("Yakup");
        hashSet.add("Emir");
        hashSet.add("Okan");
        hashSet.add("Cihan");
        hashSet.add("Mesut");
        hashSet.add("Mesut");
        hashSet.add("Mesut");
        System.out.println(hashSet);
        /*
        HashSet
# Hash bir tekniktir. Birbirine benzemeyen kodlar üretir. Bu kodlar data'yı uniq yapar
Set lere çoklu ama tekrarsız data depolamak istediğimizde ihtiyaç duyarız
# HashSet eklenen elemanların sıralaması ile uğraşmaz. Sıralama ile alakalı zaman harcmaz. Bu yüzden çok hızlı çalışır
#HashSetler indeks kullanmazlar.

 HashSetler ne zaman kullanmalı:
1)tekrarsiz elemanlarda
2)sırlama onemli degilse
3)hız cok önemliyse kullanılır

         */

    }
}
