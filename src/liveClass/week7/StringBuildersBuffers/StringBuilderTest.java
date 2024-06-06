package liveClass.week7.StringBuildersBuffers;

public class StringBuilderTest {
    public static void main(String[] args) {
        String str = "";
        StringBuilder stb = new StringBuilder();
        int n = 10000;

        //STRING
        Long startString = System.currentTimeMillis();
        for (int i=0 ; i<n ; i++){
            //str+="java";
        }
        Long finishString = System.currentTimeMillis();




         //STRINBUILDER
        Long startStringBuilder = System.currentTimeMillis();
        for (int i=0 ; i<n ; i++){
             //stb.append("java");
        }
        Long finishStringBuilder = System.currentTimeMillis();


        System.out.println("String döngü sonucu        : "+(finishString-startString));
        System.out.println("StringBuilder döngü sonucu : "+(finishStringBuilder-startStringBuilder));

    }
}
