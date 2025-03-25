import java.util.Scanner;

public class PriceQuantity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price ");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();
        double totalPrice = price * quantity;
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity " + quantity + 
                           " and unit price is INR " + price);
        scanner.close();
    }
}
