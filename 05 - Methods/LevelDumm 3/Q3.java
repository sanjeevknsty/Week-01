import java.util.Scanner;

public class Q3 {

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static boolean isHarshad(int num) {
        return num % sumOfDigits(num) == 0;
    }

    public static void digitFrequency(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }

        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (count[i] > 0) System.out.println(i + " -> " + count[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Harshad Number: " + isHarshad(num));
        digitFrequency(num);

    }
}
