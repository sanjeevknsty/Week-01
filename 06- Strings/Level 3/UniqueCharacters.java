import java.util.Arrays;
import java.util.Scanner;

public class UniqueCharacters {

    public static void findUnique(String str){
        int n =str.length();
        char[] unique = new char[n];
        int count = 0;

        for (int i =0 ; i< n ; i++){
            char c = str.charAt(i);
            boolean temp = true;

            for (int j=0 ; j< count;j++){
                if( unique[j] == c){
                    temp = false;
                    break;
                }

            }
            if(temp){
                unique[count] = c ;
                count++;
            }
        }
        System.out.println(Arrays.toString(unique));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        findUnique(str);


    }
}
