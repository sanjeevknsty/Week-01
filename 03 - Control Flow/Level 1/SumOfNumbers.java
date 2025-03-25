import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int total = 0;
        while(true){
            System.out.print("Enter Number: ");
            int n = scanner.nextInt();
            if (n == 0) break;
            total +=n;
            System.out.println("Total "+total);
        }

        scanner.close();
    }
}
