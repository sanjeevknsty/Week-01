import java.util.Scanner;

public class TraiangularPark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first side  ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side  ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side  ");
        double side3 = scanner.nextDouble();

        double perimeter = side1 + side2 + side3;
        double distance = 5000.0;
        double rounds = distance / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km.");
        
        scanner.close();
    }
}
