package liveClass.week7.lamdaa;

import java.util.ArrayList;
import java.util.List;

public class Lamda01 {
    //lamda
    //StreamAPI -- java8
     // collections ve Arraylerde kullanılır. MAp de kullanılmaz.
    public static void printNumbers(ArrayList<Integer> list){
        for (Integer w : list){
            System.out.print(w+" ");
        }
    }

    public static void  printNumbers2(ArrayList<Integer> list){
        list.stream().forEach(t->System.out.print(t+" "));
    }

}
