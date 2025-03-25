import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        if(num > 0 ){
            int greatestFactor = 0;
            int i = num-1;
           while( i >= 1){
               if(num % i == 0){
                   greatestFactor = i;
                   break;
               }
               i--;
           }
           System.out.println(greatestFactor);
        }
    }
}