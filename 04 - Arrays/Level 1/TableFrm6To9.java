import java.util.Scanner;
import java.util.Arrays;
public class TableFrm6To9 {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
       System.out.print("Enter Number 6 to 9 ");
      int num = input.nextInt();
      if (num >=6 && num <=9){
      int[] arr;
      arr = new int[10];
      
      for(int i = 0 ; i < arr.length ; i++){
          arr[i] = num * (i+1);
      }
      
      System.out.println(Arrays.toString(arr));
      
       for(int i = 0 ; i < arr.length ; i++){
          System.out.println( num + " * " +(i+1) +  " = " + arr[i] );
      }
      }else{
          System.out.println("Invalid");
      }
    }
}