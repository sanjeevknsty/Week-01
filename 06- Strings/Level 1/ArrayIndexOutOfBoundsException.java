import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static  void exception(String[] arr){
        System.out.println(arr[arr.length]);
    }
    public static  void handleException(String[] arr){
        try{

        System.out.println(arr[arr.length]);
        }catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException " + e.getMessage());

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[4];

        for(int i =0 ; i< arr.length ; i++){
            System.out.println("Enter String " + i+1);
            arr[i] = input.next();
        }
        System.out.println(Arrays.toString(arr));
//        exception(arr);
        handleException(arr);
    }
}
