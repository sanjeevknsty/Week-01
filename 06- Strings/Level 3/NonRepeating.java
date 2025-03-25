import java.util.Scanner;

public class NonRepeating {

    public static void NonRepeat(String str){
        int n =str.length();
        int [] arr = new int[256];
        for (int i =0 ; i < n ; i++){
            char c = str.charAt(i);
            int ascii = str.charAt(i);
            arr[ascii] +=1;
        }
        for (int i=0 ;i <n ;i++){
            if(arr[str.charAt(i)] == 1){
                System.out.println("First Non repeating " + str.charAt(i));
                break;
            }
        }
        for (int i =0 ; i < arr.length ; i++){
            System.out.println( (char) i + " " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        NonRepeat(str);


    }
}
