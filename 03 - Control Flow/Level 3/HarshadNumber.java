
import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int sum = 0 ;
        while(num != 0 ){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        if(sum % 3 == 0){
            
        System.out.println("Harshad Number " + sum);
        }else{
            System.out.println("Not a Harshad Number");
        }
        
    }
}