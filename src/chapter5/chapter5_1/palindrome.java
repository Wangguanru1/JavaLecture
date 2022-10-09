package chapter5.chapter5_1;
import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String reverse = new StringBuffer(str).reverse().toString();
        if(str.equals(reverse))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
