import java.util.Scanner;
public class Bonuses {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Salary");
        double salary = input.nextDouble();
        System.out.println("Enter Year of Service");
        double service  = input.nextDouble();
        if (service >= 5 ){
            double bonus = (salary/100) * 5;
        System.out.println("Your Bonus is " + bonus );
        }else{
        System.out.println("No Bonus");
    }
    }
}