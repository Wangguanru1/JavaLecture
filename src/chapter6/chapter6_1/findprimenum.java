package chapter6.chapter6_1;
import java.util.Scanner;

public class findprimenum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int count=0;
        int max = s.nextInt();
        if(max<=2) {
            System.out.println("not a prime");
            return;
        }
        else{
            for(int i=2;i<max+1;i++){
                boolean flag = true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                    count++;
                }
            }
        }
        System.out.println("质数的数量为"+count);
    }
}
