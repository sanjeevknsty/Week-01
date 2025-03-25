import java.util.Scanner;

public class LeadingAndTrailing {

    public static String removeSpaces(String str){

        while( str.charAt(0) == ' ') {
            str = str.substring(1);

        }

        int len = str.length()-1;
        while (str.charAt(len) == ' '){
            str = str.substring(0,len);
            len = str.length()-1;
        }

        System.out.println("Trimmed " + str);
        return str;
    }
    public static void subString(String str, int start, int end){
        String sub = "";
        sub = str.substring(start,end);
        System.out.println("subString " + sub);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        String trimmd = removeSpaces(str);
        System.out.println("Enter start index");
        int start = input.nextInt();
        System.out.println("Enter last index");
        int end = input.nextInt();
        subString(trimmd,start,end);

        str = str.trim();
        if(trimmd.equals(str)){
            System.out.println("Matched");
        }else System.out.println("not Matched");
    }
}
