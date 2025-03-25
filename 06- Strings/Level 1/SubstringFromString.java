import java.util.Scanner;

public class SubstringFromString {

    public static String subString(String str , int start , int end){
        String a = "";
        for(int i = start ;i<end; i++){
            a += str.charAt(i);
        }
        return  a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        System.out.println("Enter Start index");
        int start = input.nextInt();
        System.out.println("Enter End index");
        int end = input.nextInt();

        String subString = subString(str,start,end);
        System.out.println(subString);

        boolean bool = str.substring(start,end).equals(subString);
        System.out.println("Matches " + bool);

        input.close();

    }
}
