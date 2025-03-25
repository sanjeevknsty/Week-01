import java.util.Scanner;
import java.util.Arrays;
public class FizzBuzzArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Number ");
        int num = input.nextInt() ;
        String arr[] = new String [num];
       for(int i =1 ;i <=num; i++){
           if(i % 3 == 0 && i % 5 ==0){
               arr[i-1] = "FizzBuzz";
           }else if(i % 5 == 0){
               arr[i-1] = " Buzz";
           }else if(i % 3 == 0 ){
               arr[i-1] = "Fizz";
           }else{
               arr[i-1] = i + "";
           }
       }
       System.out.println(Arrays.toString(arr));
    }
}