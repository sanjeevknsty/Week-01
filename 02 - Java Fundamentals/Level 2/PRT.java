import java.util.Scanner;

public class PRT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("  Rate of Interest: ");
        double rate = scanner.nextDouble();
        System.out.print("  Time in years: ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("The Simple Interest is " + simpleInterest + 
                           " for Principal " + principal + 
                           ", Rate of Interest " + rate + 
                           " and Time " + time);

        scanner.close();
    }
}
