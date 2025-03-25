import java.util.Scanner;

public class CompareTwoStrings {
    public static boolean check(String a,String b){
        return a.equals(b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String 1");
        String str1 = input.next();
        System.out.println("Enter String 2");
        String str2 = input.next();

        boolean bool = check(str1,str2);
        System.out.println("matches " + bool);
        input.close();
    }
}
