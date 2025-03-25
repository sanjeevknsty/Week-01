import java.util.Scanner;

public class Chocolates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of chocolates: ");
        int Chocolatesa = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int Children = scanner.nextInt();

        int perChild = Chocolates / Children;
        int remainingChocolates = Chocolates % Children;

        System.out.println("The number of chocolates each child gets is " + perChild +
                           " and the number of remaining chocolates are " + remainingChocolates);

        scanner.close();
    }
}
