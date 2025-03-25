import java.util.Arrays;
import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void NonRepeat(String str){
        int n =str.length();
        int [] arr = new int[256];
        char [][] freq = new char[n][2];
        for (int i =0 ; i < n ; i++){
            char c = str.charAt(i);
            int ascii = str.charAt(i);
            arr[ascii] +=1;
        }
        int count =0;

        for (int i =0 ; i < n ; i++){
            char c = str.charAt(i);
            boolean unq = true;
            for (int j =0 ; j< count ;j++){
                if(freq[j][0] == c){
                    unq = false;
                    break;
                }
            }
            if (unq){
                freq[count][0] = c;
                int ascii =  c;
                freq[count][1] =(char) (arr[ascii] + '0') ;
                count++;
            }
        }
        System.out.println(Arrays.deepToString(freq));



        for (int i =0 ; i < arr.length ; i++){
            System.out.println( (char) i + " " + arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        NonRepeat(str);


    }
}
