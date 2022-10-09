package week2.chapter3_3;
import java.util.Scanner;

public class season {
    public static void get_season(int month){
        if(month>=3&&month<=5)
            System.out.print("spring");
        else if(month>=6&&month<=8)
            System.out.print("summer");
        else if(month>=9&&month<=11)
            System.out.print("autumn");
        else
            System.out.print("winter");
    }
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        get_season(month);
    }
}
