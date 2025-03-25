import java.util.Scanner;

public class LengthOfString {
    public static void findLength(String str){
        int i =0;

        while (true){
            try{
                str.charAt(i);
                i++;
            }catch (RuntimeException e){
                System.out.println("User Defined " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
        findLength(str);
        System.out.println("Built in " + str.length());
    }
}
