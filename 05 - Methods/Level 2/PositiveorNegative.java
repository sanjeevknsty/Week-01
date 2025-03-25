import java.util.Scanner;

public class PositiveorNegative {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        return Integer.compare(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
            if (isPositive(numbers[i])) {
                System.out.println(numbers[i] + " is Positive and " + (isEven(numbers[i]) ? "Even" : "Odd"));
            } else {
                System.out.println(numbers[i] + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result > 0) {
            System.out.println("First number is greater than last");
        } else if (result < 0) {
            System.out.println("First number is smaller than last");
        } else {
            System.out.println("First and last numbers are equal");
        }
    }
}
