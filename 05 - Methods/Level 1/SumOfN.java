import java.util.Scanner;
public class SumOfN {
    public static int naturalNumber(int n){
        return  (n * (n+1)) /2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();

        int naturalNumber = naturalNumber(num);

        System.out.println("Sum of Natural Number " + naturalNumber);
    }
}
