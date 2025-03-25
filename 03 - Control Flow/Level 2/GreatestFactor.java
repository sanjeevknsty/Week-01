import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        if(num > 0 ){
            int greatestFactor = 0;
           for(int i = num-1; i >= 1;i--){
               if(num % i == 0){
                   greatestFactor = i;
                   break;
               }
           }
           System.out.println(greatestFactor);
        }
    }
}