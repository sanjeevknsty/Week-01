import java.util.Scanner;
import java.util.Arrays;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
        int[] odd = new int[(arr.length/ 2) + 1];
        int[] even = new int[(arr.length/ 2) + 1];
        for(int i = 0; i < arr.length ; i++){
            System.out.println(" Enter Number " + (i+1));
            int num = input.nextInt() ;
            if(num < 0) break;
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        
        for(int i = 1; i <= arr.length; i++){
            if(arr[i-1] % 2 ==0){
                even[(i/2)] = arr[i-1];
            }else{
                odd[(i/2)] = arr[i-1];
            }
        }
        
        System.out.println(Arrays.toString(odd));
        System.out.println(Arrays.toString(even));
        // System.out.println("Mean of Football " + (sum/arr.length));
        
    }
}