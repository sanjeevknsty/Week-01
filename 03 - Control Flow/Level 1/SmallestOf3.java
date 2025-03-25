import java.util.Scanner;

public class SmallestOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        int number1 = scanner.nextInt();
        System.out.print("second number: ");
        int number2 = scanner.nextInt();
        System.out.print("third number: ");
        int number3 = scanner.nextInt();

        boolean   smallest = number1 < number2 && number1 < number3;

        System.out.println("Is the first number the smallest? " +   smallest);
        
        scanner.close();
    }
}
