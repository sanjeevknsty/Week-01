import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    public static int[] factors(int n){
        int count = 0;
        for (int i =1 ;i < n ; i++){
            if( n % i == 0){
            count +=1;
            }
        }
        int [] arr = new int[count];
        int index = 0;
        for (int i =1 ;i < n ; i++){
            if( n % i == 0){
                arr[index++] = i;
            }
        }
        return arr;
    }

    public static int sum(int[] arr){
        int sum =0;
        for(int i=0 ; i< arr.length ; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int[] squares(int [] arr){
        int[] square = new int[arr.length];

        for (int i =0 ; i < arr.length; i++){
            square[i] = arr[i] * arr[i];
        }

        return square;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number to Square");
        int num = input.nextInt();

        int [] arr = factors(num);
        System.out.println(Arrays.toString(arr));
        int sum = sum(arr);
        System.out.println(sum);

        int[] squ = squares(arr);
        System.out.println(Arrays.toString(squ));
    }
}
