import java.util.Arrays;
import java.util.Scanner;

public class AllCharactersString {
    public static char[] stringToArray(String str){
        char[] arr = new char[str.length()];
        for(int i = 0 ; i< str.length(); i++){
            arr[i]= str.charAt(i);

        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
        char[] arr = stringToArray(str);
        System.out.println("User Defined");
        System.out.println(Arrays.toString(arr));
        System.out.println("Builtin ");
        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        
    }
}
