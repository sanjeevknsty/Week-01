import java.util.Arrays;
import java.util.Scanner;

public class SplitText {
    public static int findLength(String str){
        int length =0 ;
        while (true){
            try{
                str.charAt(length);
                length++;
            }catch (RuntimeException e){

                break;
            }
        }
        return length;
    }

    public static String[] splitText(String str){
        int i = 0;
        int words = 0 ;
        while (true){
            try{
                char ch = str.charAt(i);
                if (ch == ' ') words++;
                i++;
            }catch (RuntimeException e){
                words+=1;
                System.out.println("User Defined " + words);
                break;
            }

        }

        String[] arr = new String[words];
        i = 0;
        int start = 0;
        int count  = 0;
        while (true){
            try{
                char ch = str.charAt(i);
                if (ch == ' ') {
                    arr[count] = str.substring(start ,i);
                    count++;
                    start = i+1;
                }
                i++;
            }catch (RuntimeException e){
                arr[count] = str.substring(start ,i);
                System.out.println("User Defined " + count);
                break;
            }

        }

        return arr;
    }
    public static boolean comapre(String[] userDefined , String[] builtIn){
        for (int i = 0; i< userDefined.length ; i++){
            if(userDefined[i].equals(builtIn[i])){
                System.out.println(userDefined[i] + " matched " + builtIn[i]);
            }
            else {
                System.out.println(userDefined[i] + " Not Matched " + builtIn[i]);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        int length = findLength(str);
        System.out.println("Length of String "+ length);
        String userSplit[] = splitText(str);
        String builtIn[] = str.split(" ");
        System.out.println(Arrays.toString(userSplit));
        System.out.println(Arrays.toString(builtIn));

        boolean bool =  comapre(userSplit,builtIn);
        System.out.println("Matched "+bool);
    }
}
