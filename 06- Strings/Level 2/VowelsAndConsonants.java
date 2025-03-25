import java.util.Arrays;
import java.util.Scanner;

public class VowelsAndConsonants {

    public static void checkChar(String str){
        char[] vowels = {'a','e','i','o','u'};
        int[] countArr = new int[2];
        for (int i = 0 ; i< str.length(); i++){
            char c = str.charAt(i);
            int ascii = str.charAt(i);

            if(ascii >= 65 && ascii <=90){
                c = (char) (str.charAt(i)+32);
            } else if ((ascii >= 0 && ascii <= 64) ||( ascii >=91 && ascii <= 96) || ascii >=123 ) {
                System.out.println("Not a Letter " + c);
                continue;
            }
            if (c == ' ') continue;


            for(char ch : vowels){
                if(ch == c){
                    System.out.println("Vowel " + c);
                    countArr[0]++;
                    break;
                }
                else {
                    System.out.println("Consotent " + c);
                    countArr[1]++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(countArr));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();

        checkChar(str);
    }
}
