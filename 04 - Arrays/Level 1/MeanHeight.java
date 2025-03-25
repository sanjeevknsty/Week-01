import java.util.Scanner;
import java.util.Arrays;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] arr = new double[11];
        double sum = 0;
        for(int i = 0; i < arr.length ; i++){
            System.out.println(" Enter Number " + (i+1));
            double num = input.nextDouble() ;
            arr[i] = num;
            sum += num;
        }
        System.out.println(Arrays.toString(arr));
        
        System.out.println("Mean of Football " + (sum/arr.length));
        
    }
}