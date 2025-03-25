import java.util.Scanner;

public class CanVote {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            int sum = age * (age + 1) / 2;
            System.out.println("The person's age is " + age + " and can vote ");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote ");
        }

        scanner.close();
    }
}
