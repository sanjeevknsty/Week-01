import java.util.Scanner;

public class NumberFormatException {
    public static void exception(String str){
        System.out.println(Integer.parseInt(str));

    }

    public static void handleException(String str) {
     try{
         System.out.println(Integer.parseInt(str));

     }catch (java.lang.NumberFormatException e){
         System.out.println("NumberFormatException " + e.getMessage());
     }catch (RuntimeException e){
         System.out.println("RuntimeException " + e.getMessage());
     }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
//        exception(str);
        handleException(str);
    }
}
