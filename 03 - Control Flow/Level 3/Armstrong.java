
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int sum = 0 ;
        while(num != 0 ){
            int digit = num % 10;
            sum += (digit* digit * digit);
            num = num / 10;
        }
        if(sum == num){
            
        System.out.println("Armstrong Number" + num);
        }else{
            System.out.println("Not a Armstrong Number");
        }
        
    }
}