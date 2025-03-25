import java.util.Scanner;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        int i =0;
        int j= str.length()-1;
        boolean temp = true;
        while (i < j){
            if(str.charAt(i) != str.charAt(j)){
                temp = false;
                break;
            }
            i++;
            j--;
        }

        if(temp)
            System.out.println("palindrome");
        else
            System.out.println("Not palinrome");
    }
}
