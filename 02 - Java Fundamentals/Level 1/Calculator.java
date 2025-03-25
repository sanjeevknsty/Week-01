import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num1 = input.nextInt();
       int num2 = input.nextInt();
       System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers " +  num1 + " and " +  num2 + " is " + (num1 + num2) + "," +(num1 - num2 )+ ","+ (num1 * num2) + " and " + (double)(num1 / num2));

        input.close();
    }
}