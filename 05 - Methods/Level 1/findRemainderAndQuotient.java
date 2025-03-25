import java.util.Arrays;
import java.util.Scanner;
public class findRemainderAndQuotient {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[] {remainder,quotient};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = input.nextInt();
        System.out.println("Enter Divisor");
        int divisor = input.nextInt();
        int[] arr = findRemainderAndQuotient(number,divisor);
        System.out.println(Arrays.toString(arr));
        System.out.println("Remainder :" + arr[0] + " Quotient " + arr[1]);
    }
}
