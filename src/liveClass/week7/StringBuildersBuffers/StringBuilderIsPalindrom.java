package liveClass.week7.StringBuildersBuffers;

import java.util.Scanner;

public class StringBuilderIsPalindrom {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("isPalindrome(str) = " + isPalindrome(str));
    }

    //bir stringin palindrom olup olmadığını StringBuilder kullanarak bulunuz
    public static boolean isPalindrome(String str) {
        StringBuilder stBr = new StringBuilder(str).reverse();
        String reversedStr = stBr.toString();

       return reversedStr.equalsIgnoreCase(str); // ==
    }
}
