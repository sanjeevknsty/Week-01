import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fee  ");
        double fee = input.nextDouble();

        System.out.print("Enter discount ");
        double dis = input.nextDouble();

        double discount = (fee * dis) / 100;

        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + 
                           " and the final discounted fee is INR " + finalFee);

        
    }
}