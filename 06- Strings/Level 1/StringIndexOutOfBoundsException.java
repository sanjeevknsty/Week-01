import java.util.Scanner;

public class StringIndexOutOfBoundsException {
    public static char forException(String str){

        return str.charAt(str.length() + 1);
    }

    public static char StringIndexOutOfBoundsException(String str){
        return str.charAt(str.length() + 1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
//        char ch =  forException(str);
//        System.out.println(ch);
        try{
            char ch2 =  StringIndexOutOfBoundsException(str);
            System.out.println(ch2);

        }catch (java.lang.StringIndexOutOfBoundsException e){
            System.out.println("CAUGHT EXCEPTION"+e.getMessage() );
        }
    }
}
