package chapter5.chapter5_3;
import java.util.Scanner;

public class sixteentoren {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int result=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<='9')
                result+=Math.pow(16,str.length()-i-1)*(str.charAt(i)-'0');
            else
                result+=Math.pow(16,str.length()-1-i)*(10+(str.charAt(i)-'a'));
        }
        System.out.println(result);
    }
}
