# JavaLecture
## 2022-9-16
1. ### java中的参数传递都是值传递
2. ### Java数组声明
    ```java
   int a[][]=new int[6][];
   int b[]=new int[2];
   //int a[]=new int[] wrong
   //int a[][]=new int[][6] wrong
   ```
3. ### 不等长数组
    ```java
    int a[][]=new int[2][];
    a[0]=new int[5];
    a[1]=new int[8];
    ```

4. ### 可变长的参数列表

   ```java
   void printfObjects ( Object ... list ) {
       //list is an Object []
       for( Object o : list ) {
           System.out.printf( o );
   	}
   }
   ```

   *一个方法只能有一个varargs声明，并且它必须在方法签名的最后*

5. ### Arraylist

   [菜鸟教程](https://www.runoob.com/java/java-arraylist.html)