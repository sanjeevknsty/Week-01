import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("first number: ");
        int number1 = scanner.nextInt();
        System.out.print("second number: ");
        int number2 = scanner.nextInt();
        System.out.print("third number: ");
        int number3 = scanner.nextInt();


        boolean largest1 = number1 > number2 && number1 > number3;
        boolean largest2 = number2 > number1 && number2 > number3;
        boolean largest3 = number3 > number1 && number3 > number2;

        System.out.println("Is the first number the largest? " + largest1);
        System.out.println("Is the second number the largest? " + largest2);
        System.out.println("Is the third number the largest? " + largest3);

        scanner.close();
    }
}