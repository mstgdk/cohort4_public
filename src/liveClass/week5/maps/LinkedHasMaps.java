package liveClass.week5.maps;

import java.util.LinkedHashMap;

public class LinkedHasMaps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        map.put("Yakup",1990);
        map.put("Onur",1993);
        map.put(null,1999);
        map.put("cihan",1988);
        map.put("Murat",2000);
        map.put("Irmak",1998);
        map.put("Mehmet",1999);
        map.put("Mehmet",1999);


        System.out.println(map);
    }
}
