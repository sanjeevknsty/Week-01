import java.util.Scanner;

public class PoundToKilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("  Weight in Pound: ");
        double Pound = scanner.nextDouble();
        
        double Kg = Pound * 2.2;

        System.out.println("The weight of the person in pound is " +Pound+ " and in kg is "+ Kg);

        scanner.close();
    }
}
