import java.util.Arrays;
import java.util.Scanner;

public class TextToLowercase {

    public static int[] convert(String str){
        int[] ASCII = new int[str.length()];
        for (int i =0 ; i<str.length(); i++){
            ASCII[i]= str.charAt(i)+32;

        }
        System.out.println(Arrays.toString(ASCII));

        return ASCII;
    }
    public static void compare(int[] arr,String str){
        String lowerCase = str.toLowerCase();
        for(int i =0 ; i< arr.length ;i++){
            if(lowerCase.charAt(i) == arr[i]){
                System.out.println( (char)arr[i]+" Matched " + lowerCase.charAt(i));
            }
            else {
                System.out.println("Not Matched " + (char)arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Upper Case");
        String str = input.nextLine();
        int[] ASCII = convert(str);
        for (int i = 0; i < ASCII.length; i++) {
            System.out.println((char)ASCII[i] + "-" +
                    ASCII[i]);
        }
        compare(ASCII,str);
    }

}
