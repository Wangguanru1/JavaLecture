package week2.chapter3_6;

public class seven {
    public static void main(String args[]){
        int count=0;
        int total=0;
        for(int i=7;i<100;i+=7){
            count++;
            total+=i;
        }
        System.out.print(count+" "+total);
    }
}
