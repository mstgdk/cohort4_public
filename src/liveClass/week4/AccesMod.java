package liveClass.week4;

public class AccesMod {
    private String name = "Patika";
    public static void main(String[] args) {
        // ACCESS MODIFIERS
        //public--her yerden
        //protected -- her zaman aynı package dan + parent/child -->farklı package'dan
        //default -- yalnızca aynı package'dan
        //private -- aynı class

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   protected static void myMethod(){
        System.out.println("Metoda ulaşıldı");
    }
}
