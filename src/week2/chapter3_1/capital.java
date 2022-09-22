package week2.chapter3_1;
import java.util.Scanner;

public class capital {
    public static void main(String args[]){
        Scanner scanner =new Scanner(System.in);
        String chapter=scanner.next();
        switch(chapter){
            case "a": System.out.print("A");break;
            case "b": System.out.print("B");break;
            case "c": System.out.print("C");break;
            case "d": System.out.print("D");break;
            case "e": System.out.print("E");break;
            default: System.out.print("other");
        }
    }
}
