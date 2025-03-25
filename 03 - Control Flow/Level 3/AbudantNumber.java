
import java.util.Scanner;

public class AbudantNumber {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int sum = 0 ;
        for(int i= 1; i < num/2 ;i++){
             if( num % i == 0){
                sum += i;     
             }
            
        }
        if(sum  > num){
            
        System.out.println("Abundant Number " + sum);
        }else{
            System.out.println("Not a Abundant Number " + sum);
        }
        
    }
}