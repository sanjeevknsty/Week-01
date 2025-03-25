import java.util.Scanner;
import java.util.Arrays;
class MultiplicationTable {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
       System.out.print("Enter Number ");
      int num = input.nextInt();
      int[] arr;
      arr = new int[10];
      
      for(int i = 0 ; i < arr.length ; i++){
          arr[i] = num * (i+1);
      }
      
      System.out.println(Arrays.toString(arr));
      
       for(int i = 0 ; i < arr.length ; i++){
          System.out.println( num + " * " +(i+1) +  " = " + arr[i] );
      }
      
    }
}