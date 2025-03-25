import java.util.Scanner;

public class CountVowelsandConsonants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.next();
        char[] vowels ={'a','e','i','o','u'};
        int vowCount = 0;
        int count = 0;

        for(int i = 0 ;i < str.length() ; i++){
            for(char ch : vowels){
                if(str.charAt(i) == ch){
                    vowCount++;
                    break;
                }else {
                    System.out.println(count);
                    count++;
                    break;
                }

            }
        }

        System.out.println("Vowels " + vowCount + " Consonents "  +count);

    }
}
