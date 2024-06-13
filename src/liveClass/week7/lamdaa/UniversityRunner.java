package liveClass.week7.lamdaa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniversityRunner {
    public static void main(String[] args) {
        University u01 = new University("odtu","matematik",1000,75);
        University u02 = new University("ıtu","ingilzce",950,85);
        University u03 = new University("katu","fizik",850,79);
        University u04 = new University("ytu","mat",1200,89);
        University u05 = new University("ege","kimya",550,89);
        University u06 = new University("bilkent","bilgisayar",700,99);
        University u07 = new University("matu","mate",700,95);

        List<University> unv = new ArrayList<>(Arrays.asList(u01,u02,u03,u04,u05,u06,u07));

       // System.out.println("Lamda04.university1(unv) = " + Lamda04.university1(unv));
       // System.out.println("Lamda04.university2(unv) = " + Lamda04.university2(unv));
       // System.out.println(Lamda04.unvSirala(unv));
        //System.out.println("Lamda04.university3(unv) = " + Lamda04.university3(unv));
        System.out.println("Lamda04.university4(unv) = " + Lamda04.university4(unv));
    }
}
