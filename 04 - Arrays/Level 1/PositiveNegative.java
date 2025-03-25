import java.util.Scanner;
import java.util.Arrays;
public class PositiveNegative {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      int[] arr;
      arr = new int[5];
      
      for(int i = 0 ; i <arr.length ; i++){
           System.out.println("Enter Number " + (i+1));
            arr[i] = input.nextInt();
      }
      
      for(int i = 0 ; i < arr.length ; i++){
          if(arr[i] < 0){
              System.out.println( arr[i] + " is Negative" );
          }
          else if(arr[i] > 0){
              if(arr[i] % 2 ==0){
                  System.out.println(arr[i] + " is Even");
              }
              else{
                  System.out.println(arr[i] + " is Odd");
              }
          }
          else{
              System.out.println(arr[i] + " Zero");
          }
      }
      int a = arr[0];
      int b = arr[arr.length - 1];
      if(a == b ){
          System.out.println("First and Last are Equal");
      }else if (a > b){
          System.out.println("Greater");
      }else{
          System.out.println("Smaller");
          
      }
      
    }
}