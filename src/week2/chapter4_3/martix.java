package week2.martix;

public class martix {
    private static int[][] add(int[][] add1,int[][]add2){
        for(int i=0;i<add1.length;i++){
            for (int j=0;j<add1[0].length;j++){
                add1[i][j]=add1[i][j]+add2[i][j];
            }
        }
        return add1;
    }

    private static int[][] multiply(int[][] add1,int[][] add2){
        int[][] result=new int[add1.length][add1.length];
        for(int i=0;i<add1.length;i++){
            for(int j=0;j<add2[0].length;j++){
                for(int k=0;k<add1[0].length;k++){
                    result[i][j]+=add1[i][k]+add2[k][j];
                }
            }
        }
        return result;
    }
}
