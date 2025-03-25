import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Q7 {

    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many OTPs to generate: ");
        int count = sc.nextInt();
        int[] otpArray = new int[count];

        for (int i = 0; i < count; i++) {
            otpArray[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + java.util.Arrays.toString(otpArray));
        System.out.println("Are all OTPs unique? " + areOTPsUnique(otpArray));


    }
}
