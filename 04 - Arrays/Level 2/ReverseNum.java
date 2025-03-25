import java.util.Arrays;
import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number ");
    long num = input.nextLong();
    long temp = num;
    long digit ;
    int count =0;
    while(temp != 0 ){
        temp = temp/10;
        count++;
    }
    int[] arr = new int[count];
    int i =0;
    while(num != 0 ){
        digit =  num % 10;
        arr[i] = (int)digit;
        num = num/10;
        i++;
    }
   System.err.println(Arrays.toString(arr));
   
    
}
}