import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();

        String rev = "";
        for(int i = str.length()-1 ; i>=0 ;i--){
            rev += str.charAt(i);

        }
        System.out.println("Reverse " + rev);
    }
}
