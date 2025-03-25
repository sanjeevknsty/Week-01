import java.util.Arrays;
import java.util.Scanner;

public class SplitTheText2D {
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
                System.out.println("Words in array " + words);
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
                break;
            }

        }

        return arr;
    }

    public static void lengthOfWord(String[] arr){
        String[][] len = new String[arr.length][2];
        for (int i =0 ; i< arr.length ; i++){
            for (int j =0 ; j< 2 ; j++){

            if (j == 1 )
                len[i][j] = String.valueOf(findLength(arr[i]));
            else{
                len[i][j] = arr[i];
            }
            }
        }
        System.out.println(Arrays.deepToString(len));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String");
        String str = input.nextLine();
        int length = findLength(str);
        System.out.println("Length of String "+ length);
        String userSplit[] = splitText(str);
        System.out.println(Arrays.toString(userSplit));

        lengthOfWord(userSplit);



    }
}
