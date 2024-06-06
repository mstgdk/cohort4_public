package liveClass.week7.lamdaa;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(34, 22, 16, 11, 35, 20, 63, 21, 65, 44, 66, 64, 81, 38, 15));
        Lamda01.printNumbers(list);
        System.out.println();
        Lamda01.printNumbers2(list);
    }
}
