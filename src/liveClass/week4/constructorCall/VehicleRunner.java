package liveClass.week4.constructorCall;

public class VehicleRunner {
    public static void main(String[] args) {
        //Example 1: Car turunde, rengi beyaz olan, 54000km de, 250.000TL fiyati olan,
        //           2020 model,   bir Honda Accord aluşturun.
        //HondaAccord hacc = new HondaAccord(250000, 2020);
       Car myHonda = new HondaAccord(250000,2020,"white","H200");
        //System.out.println(hacc.color);

/*
INHERITANCE’da CONSTRUCTOR’ların ÇALIŞMASI
1)Java da Object oluştururken önce Parent Constructorlar  Parent'dan Child'a doğru çalıştırılır
2) Java en üst Parent Constructur'a çıkabilmek için "super()" kodunu kullanır
3) "super()" kodu her Constuctor'ın ilk satırında gizli olarak bulunur
4) "super()" kodunu isterseniz görünür şekilde de yazabilirsiniz

 */


    }
}
