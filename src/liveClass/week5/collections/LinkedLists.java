package liveClass.week5.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        /*
        LINKEDLIST
1)LinkedList'deki her eleman iki bölümden oluşur. i)Data ii)Pointer
2)LinkedList'deki her bir eleman "Node" olarak adlandırılır.
3)LinkedList'ler eleman ekleme ve eleman silme işlemlerinde çok başarılıdırlar. 4)LinkedList'ler eleman arama işlemlerinde başarısızdırlar.
5)3. ve 4. maddelerden dolayı eleman ekleme ve eleman silme işlemlerinin çok yapılacağı durumlarda LinkedList kullanılmalıdır.
6)ArrayList'ler index kullanır LinkedList'ler index kullanmaz.
7)index kullanmak eleman bulma işlemlerinde çok başarılıdır, bu yüzden eleman bulma işlemlerini çok yapacaksanız ArrayList kullanmalısınız.

         */

        LinkedList<Integer> linkList1 = new LinkedList<>();

        List<Integer> linkList = new LinkedList<>();
        linkList.add(3);
        linkList.add(6);
        linkList.add(7);
        linkList.add(9);
        linkList.add(1);
        System.out.println(linkList);//insertion order
        System.out.println(linkList.get(3));

    }
}
