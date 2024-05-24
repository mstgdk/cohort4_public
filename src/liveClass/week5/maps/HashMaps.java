package liveClass.week5.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
1)Map'ler key-value structure kullanir
2)Key'ler unique'dir
3)Value'lar tekrarli data icerebilir
4)Map'lerde eleman degil EntrySet kullaniriz.
5)Key'ler de null tekrarsiz olarak kullanilir
6)Value'lar null kabul eder.
7)HashMap'ler EntrySet'leri herhangi bir siralamaya tabi tutmaz, rastgele siralar
8)Siralama ile vakit jaybetmedigi icin HashMap'ler cok hizli calisirlar.

 */

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Yakup",1990);
        map.put("Onur",1993);
        map.put("cihan",1988);
        map.put("Murat",2000);
        map.put("Irmak",1998);
        map.put("Mehmet",1999);
        System.out.println(map);

        System.out.println(map.keySet());//[Irmak, Onur, Mehmet, cihan, Yakup, Murat]
        System.out.println(map.values());//[1998, 1993, 1999, 1988, 1990, 2000]
        System.out.println(map.get("Onur"));//1993-- girilen key e ait value verir

        //remove(x)--entryseti siler, value'u return eder
        System.out.println("map.remove(\"Mehmet\") = " + map.remove("Mehmet"));
        System.out.println(map);

        //remove(x,y)--silerse true  return eder
        System.out.println("map.remove(\"Irmak\",1998) = " + map.remove("Irmak", 1998));
        System.out.println(map);

        //entrySet()--mapp in tüm elemanlarını SET içine atar.
        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String,Integer> w : entries){
            System.out.println(w.setValue(2222));
        }
        System.out.println(entries);
    }
}
