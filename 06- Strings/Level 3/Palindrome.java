import java.util.Scanner;

public class Palindrome {
    public static void brueteForce(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
           if(str.charAt(i) != str.charAt(j) ){
                System.out.println("Not Palindrome");
               return;
            }
           i++;
           j--;
        }
        System.out.println("Palindrome");
    }

    public static boolean recursive(String str,int start , int end){
        if(start > end){
            System.out.println("palindrome");
            return true;
        }
        if(str.charAt(start) != str.charAt(end)){
            System.out.println("Not palindrome");
            return false;
        }
        return recursive(str,start+1,end-1);
    }

    public static void reverse(String str){
        int n  =str.length();
        char[] arr = str.toCharArray();
        char[] revArr = new char[n];
        for (int i =0 ; i< n;i++){
            revArr[i] = arr[n-i-1];
        }
        int i = 0;
        while (i < n){
            if(arr[i] != revArr[i] ){
                System.out.println("Not Palindrome");
                return;
            }
            i++;
        }
        System.out.println("Palindrome");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string for palindrome");
        String str = input.next();

        brueteForce(str);
        int n = str.length()-1;
        boolean bool = recursive(str,0,n);
        System.out.println(bool);

        reverse(str);

    }
}
