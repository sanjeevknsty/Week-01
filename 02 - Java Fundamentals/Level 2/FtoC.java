import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celcius = (fahrenheit - 32) * 5/9 ;
    System.out.println("The " +fahrenheit + " celsius is "+  celcius);
        scanner.close();
    }
}
