package week2.chapter4_1;

public class insert {

    private static int[] insertNum2(int[] list, int num){
        int[] newlist=new int[list.length+1];
        int count;
        for(count=0;count<list.length;count++){
            if(num<=list[count])
                break;
            count++;
        }
        newlist[count]=num;
        for(int i=0;i<count;i++)
            newlist[i]=list[i];
        for(int i=count;i< list.length;i++)
            newlist[i+1]=list[i];
        return newlist;
    }

    public static void main(String args[]){
        int list[] = {11,22,26,33,43,65,78,79,85,96};
        for(int number: insertNum2(list,25)){
            System.out.println(number);
        }
    }
}
