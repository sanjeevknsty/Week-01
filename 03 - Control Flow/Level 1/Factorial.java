import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int fact= 1;
        int  i=1;
        while(n >= i){
            fact *= i;
            i++;
        }
        System.out.println("Factorial "+fact);
        


        scanner.close();
    }
}
