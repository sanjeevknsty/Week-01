import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Celcius: ");
        double celcius = scanner.nextDouble();
        double fahrenheit = (celcius * 9/5) + 32 ;
    System.out.println("The " +celcius + " celsius is "+  fahrenheit);
        scanner.close();
    }
}
