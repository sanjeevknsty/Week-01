import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int fact= 1;
        
        for(int i=1;i <= n;i++){
            fact *= i;
            
        }
        System.out.println("Factorial "+ fact);
        
        scanner.close();
    }
}
