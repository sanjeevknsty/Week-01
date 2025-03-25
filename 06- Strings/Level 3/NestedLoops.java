import java.util.Arrays;
import java.util.Scanner;

public class NestedLoops {

    public static void freqCharacters(String str){
        int n =str.length();
        int count =0;
        int [] freq = new int[n];
        char [] character = str.toCharArray();
        for (int i =0 ; i < n ; i++){
//           freq[i] = 1;
            for (int j =0 ; j< n ;j++){
                if(character[i] == character[j]){
                    freq[i]+=1;
                }
            }

        }
        System.out.println(Arrays.toString(freq));
        System.out.println(Arrays.toString(character));

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();

        freqCharacters(str);


    }
}
