package week2.chapter3_4;
import java.util.Scanner;

public class date {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        switch (month){
            case 1: System.out.print((month-1)*30+day);break;
            case 2:
            case 3:
                System.out.print((month-1)*30+day+1);break;
            case 4:
            case 5:
                System.out.print((month-1)*30+day+2);break;
            case 6:
            case 7:
                System.out.print((month-1)*30+day+3);break;
            case 8: System.out.print((month-1)*30+day+4);break;
            case 9:
            case 10:
                System.out.print((month-1)*30+day+5);break;
            case 11:
            case 12:
                System.out.print((month-1)*30+day+6);break;
        }

    }

}
