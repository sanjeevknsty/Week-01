import java.util.Scanner;
import java.util.Arrays;
public class FrequencyOfDigit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int [] arr = new int[10];
        int i =0 ;
        while(num !=0 ){
            int digit = num % 10;
            arr[i] = digit;
            num = num/10;
            i++;
        }
        System.out.println(Arrays.toString(arr));


        int [] freq =new int[10];

        for(int j =0 ; j < arr.length ; j++){
            freq[arr[j]] +=1;
        }
        for(int j =0 ; j< freq.length ; j++){

        System.out.println( j + " : " + freq[j]);
        }
    }
}
