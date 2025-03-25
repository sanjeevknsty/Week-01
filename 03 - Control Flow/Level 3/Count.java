
import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int count = 0 ;
        while(num != 0 ){
            count += 1;
            num = num / 10;
        }
        System.out.println("Count " + count);
        
        
    }
}