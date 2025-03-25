import java.util.Scanner;

public class IllegalArgumentException {
    public static void useSubString(String str){
        System.out.println(str.substring(str.length(),str.length()+1));
    }

    public static void ArgumentException(String str){
        try{
            System.out.println(str.substring(str.length(),2));
            throw new java.lang.IllegalArgumentException();
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("IllegalArgumentException Status " + e.getMessage());
        }
        catch (RuntimeException e) { // Generic catch for unexpected runtime exceptions
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
//        useSubString(str);
        ArgumentException(str);

    }
}
