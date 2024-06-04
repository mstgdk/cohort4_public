package liveClass.week7;

public class StringBuilders {
    public static void main(String[] args) {
        StringBuffer stf = new StringBuffer("ssssss");
        //String-->immutable (değiştirilemez)
        //StringBuilder --> mutable
        //değer atama 1yol
        StringBuilder stb = new StringBuilder("Patika");
        stb.append(" Dev").append(" Java");//2.yol
        System.out.println(stb);//Patika Dev Java
        //karakter sayısı bulma
        System.out.println(stb.length());
        //setCharAt()
        stb.setCharAt(5,'A');
        System.out.println(stb);//PatikA Dev Java

        //delete()
        stb.delete(11,14);//11 i siler, 14ü silmez
        System.out.println(stb);
        //deleteCharAt
        stb.deleteCharAt(11);
        System.out.println(stb);//PatikA Dev

        //reverse
        System.out.println(stb.reverse());//veD AkitaP
        //String Builder -->String
        StringBuilder stb2 = new StringBuilder("Java");
        System.out.println(stb2.getClass());
        String str = stb2.toString();
        System.out.println(str.getClass());

        //String --> StringBuilder
        String str2 = "Mesut";
        StringBuilder stb3 = new StringBuilder(str2);

        //insert
        StringBuilder stb4 = new StringBuilder("java");
        stb4.insert(2,"Turkey",1,3);
        System.out.println(stb4);

        //compareTo
        System.out.println(stb2.compareTo(stb4));
        System.out.println(stb4.compareTo(stb2));
        StringBuilder stb5 = new StringBuilder("java");
        System.out.println("stb4.compareTo(stb5) = " + stb4.compareTo(stb5));
        System.out.println(stb5.compareTo(stb4));


        //
        /*String a = "Java";
        a.concat("Dev");
        System.out.println(a);

        StringBuilder stb1 = new StringBuilder("Java");
        stb1.reverse();
        System.out.println(stb1);*/

    }

}
