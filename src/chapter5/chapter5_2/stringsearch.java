package chapter5.chapter5_2;
import javafx.scene.Camera;

import java.util.Scanner;

public class stringsearch {
    public static int compare(String str1, String str2){
        for(int i=0;i<str2.length()-str1.length()+1;i++){
            int count=0;
            for(int j=0;j<str1.length();j++){
                if(str2.charAt(i+j)==str1.charAt(j))
                    count++;
            }
            if(count==str1.length())
                return i;
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();
        if(compare(str1,str2)>-1)
            System.out.println(compare(str1,str2));
        else
            System.out.println("Not found");
    }
}
