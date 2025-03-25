import java.util.Arrays;
import java.util.Scanner;
public class LargeAndSecondNum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Number ");
    long num = input.nextLong();
    int maxDigit = 10;
    int[] arr = new int[maxDigit];
    long digit ;
    int i =0;
    while(num != 0 ){
        if((i+1) >= maxDigit){
            maxDigit +=10;
            int [] temp = new int[maxDigit];
            System.arraycopy(arr ,0 ,temp,0,arr.length);
            arr = new int[maxDigit];
            System.arraycopy(temp, 0, arr, 0, temp.length);
        }
        digit =  num % 10;
        arr[i] = (int)digit;
        num = num/10;
        i++;
    }
   System.err.println(Arrays.toString(arr));
   long largest = arr[0];
   long secondLargest = arr[0];

   for(int j = 1; j<maxDigit ; j++){
    if(largest < arr[j]){
        secondLargest = largest;
        largest = arr[j];

    }
   }
   System.out.println(largest);
   System.out.println(secondLargest);
    
}
}