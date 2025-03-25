import java.util.Scanner;

public class Q5 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int num) {
        int sum = sumOfDigits(num * num);
        return sum == num;
    }

    public static boolean isSpy(int num) {
        int sum = 0, product = 1, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphic(int num) {
        return String.valueOf(num * num).endsWith(String.valueOf(num));
    }

    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Is Prime: " + isPrime(num));
        System.out.println("Is Neon: " + isNeon(num));
        System.out.println("Is Spy: " + isSpy(num));
        System.out.println("Is Automorphic: " + isAutomorphic(num));
        System.out.println("Is Buzz: " + isBuzz(num));


    }
}
