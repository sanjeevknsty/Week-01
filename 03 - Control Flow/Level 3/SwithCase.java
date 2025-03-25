import java.util.Scanner;

public class SwithCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter  number: ");
        double num2 = scanner.nextDouble();

        System.out.println("+  -  *  /  ");
        String op = scanner.next();



            switch (op) {
                case "+":
                    System.out.println("addition: " + (num1 + num2));
                    break;
                case "-":
                    System.out.println("subtraction: " + (num1 - num2));
                    break;
                case "*":
                    System.out.println("multiplication: " + (num1 * num2));
                    break;
                case "/":
                    if (num2 != 0) {
                        System.out.println("division: " + (num1 / num2));
                    } else {
                        System.out.println("zero not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid");
            }
        

        scanner.close();
    }
}
