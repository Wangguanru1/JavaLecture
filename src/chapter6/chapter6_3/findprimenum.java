package chapter6.chapter6_3;
import java.util.Scanner;
import java.util.Vector;

public class findprimenum {
    public static void main(String args[]){
        Vector vec = new Vector();
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
                for(int j=0;j<vec.size();j++){
                    if(i% (int)vec.get(j) ==0){
                        flag=false;
                        break;
                    }
                }
                if(flag){
                    System.out.println(i);
                    vec.addElement(i);
                    count++;
                }
            }
        }
        System.out.println("质数的数量为"+count);
    }
}
