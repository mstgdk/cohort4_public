package liveClass.week5.Varrg;

public class Vargs {
    public static void main(String[] args) {
        System.out.println(addNum(2,3,6,7,9,7,8,23,56));
    }
    public static int addNum(int b, int...a){
        int sum =0;
        for (int w : a){
            sum+=w;
        }
        return sum+b;
    }



    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b,int c){
        return a+b+c;
    }
    public static int add(int a, int b,int c, int d){
        return a+b+c+d;
    }
}
