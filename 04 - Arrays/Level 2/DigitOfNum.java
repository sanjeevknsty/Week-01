import java.util.Arrays;
import java.util.Scanner;
public class DigitOfNum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number ");
    long num = input.nextLong();
    int maxDigit = 10;
    int[] arr = new int[maxDigit];
    long digit ;
    
    for(int i = 0 ; i < maxDigit; i++){
        digit =  num % 10;
        System.out.println(digit);
        arr[i] = (int)digit;
        num = num/10;
        System.out.println(num);
    }
    System.err.println(Arrays.toString(arr));
   long largest = arr[0];
   long secondLargest = arr[0];

   for(int i = 1; i<maxDigit ; i++){
    if(largest < arr[i]){
        secondLargest = largest;
        largest = arr[i];

    }
   }
   System.out.println(largest);
   System.out.println(secondLargest);
    
}
}