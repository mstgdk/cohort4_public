package liveClass.week5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> list2 = new ArrayList<>();
        list2.add(17);
        list2.add(19);
        list2.add(23);
        System.out.println(list2);//[17, 19, 23]


        ArrayList<Integer> list = new ArrayList<>();

        list.add(7);
        list.add(9);
        list.add(3);
        list.add(1);
        list.add(0);
        System.out.println(list);//Arraylistler girilen sıralamada eleman ekler.(insertion order)

        System.out.println(list.get(2));//3
        list.add(2,99);
        System.out.println(list);//[7, 9, 99, 3, 1, 0]

        //adAll()
        list.addAll(2,list2);
        System.out.println(list);//[7, 9, 17, 19, 23, 99, 3, 1, 0]

        //size
        int len = list.size();
        System.out.println(len);//9

        //set
        Integer a = list.set(5,22);
        System.out.println(list);

        //remove()-->primitive değer yazılırsa index olarak algılar. N-Primitive yazılırsa elemean olarak algılar
        Integer b = 3;
        list.remove(Integer.valueOf(3));
        System.out.println(list);

        //contain()
        boolean isContain = list.contains(19);
        System.out.println(isContain);//true

        //containAll()
        boolean isContainAll =  list.containsAll(list2);
        System.out.println(isContainAll);

        //equals()
        boolean isEqual = list.equals(list2);
        System.out.println(isEqual);

        //Array kullaanarak eleman ekleme
        Integer[] arr  = {1,2,3,7,9,5,6,6,6,6,6};
        List<Integer>list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);
    }
}
