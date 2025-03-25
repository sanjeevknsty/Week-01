import java.util.Scanner;
import java.util.Arrays;
class AgeOfTen {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        Scanner input = new Scanner(System.in);
        
        int [] arr;
        arr = new int[10];
        
        for (int i= 0 ; i<arr.length ; i++){
            System.out.println("Enter Age " + (i+1));
            arr[i] = input.nextInt();
        }
        for(int i =0 ; i< arr.length ; i++){
            if(arr[i] >= 18){
                System.out.println(i+1 + " with Age " + arr[i] + " Can Vote");
            }else{
                System.out.println(i+1 + " with " + arr[i] + " Cannot Vote");
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}