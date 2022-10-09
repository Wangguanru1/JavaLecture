package week2.chapter3_2;
import java.util.Scanner;

public class grade {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int grade=scanner.nextInt();
        if(grade>=60)
            System.out.print("pass");
        else
            System.out.print("fail");
    }
}
