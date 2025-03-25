import java.util.Scanner;
import java.util.Arrays;
public class StoreMultiValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[10];
        int i = 0;
        while(true){
            if (i > 9){
                break;
            }
        System.out.println(" Enter Number " + (i+1));
            double num = input.nextDouble() ;
            if (num <= 0){
                break;
            }
            arr[i] = num;
            i++;
        }
        System.out.println(Arrays.toString(arr));
        double total = 0;
        for(i = 0 ; i< arr.length ; i++){
            total += arr[i];
        }
        System.out.println(total);
        
    }
}