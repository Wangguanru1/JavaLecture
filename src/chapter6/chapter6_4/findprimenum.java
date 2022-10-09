package chapter6.chapter6_4;
import java.util.Scanner;
import java.util.Vector;

public class findprimenum {

    public static Vector minprime(int n){
        Vector vec = new Vector();
        if(n<=2){
            System.out.println("not a prime");
            return vec;
        }
        else{
            for(int i =2;i<n+1;i++){
                boolean flag = true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        flag=false;
                        break;
                    }
                    if(flag)
                        vec.addElement(i);
                }
            }
        }
        return vec;
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        if(n1>2){
            Vector res=minprime(n1);
            for (Object re : res) {
                if (n1 % (int) re == 0) {
                    System.out.println(n1 + "=" + re + "*" + n1 / (int) re);
                    break;
                }
            }
        }
    }
}




