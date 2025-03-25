import java.util.Scanner;

public class MultiplesOfNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number < 100 ");
        int number = scanner.nextInt();

        if (number > 0 && number < 100) {
            int counter = number - 1;
            while (counter > 1) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        scanner.close();
    }
}
