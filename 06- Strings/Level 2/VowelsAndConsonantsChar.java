import java.util.Scanner;

public class VowelsAndConsonantsChar {

    public static void checkChar(String str){
        char[] vowels = {'a','e','i','o','u'};

        String [][] resultArr = new String[str.length()][2];
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

            resultArr[i][0] = String.valueOf(c);
            for(char ch : vowels){
                if(ch == c){
                    System.out.println("Vowel " + c);
                    resultArr[i][1] = "vowel";
                    break;
                }
                else {
                    System.out.println("Consotent " + c);
                    resultArr[i][1] = "Consotent";
                    break;
                }
            }
        }
        for (int i =0 ; i< resultArr.length ;i++){
            if(resultArr[i][0] == null) continue;
            System.out.println(resultArr[i][0] + " " + resultArr[i][1]);

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        checkChar(str);

    }
}
