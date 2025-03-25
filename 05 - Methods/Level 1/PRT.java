import java.util.Scanner;
import java.util.Arrays;
public class Q1 {

    public static Double simpleInterest(double p ,double r , double t){
        double interest = p * r * t /100 ;
        return interest;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principle");
        double principle = input.nextInt();
        System.out.println("Enter rate");
        double rate = input.nextInt();
        System.out.println("Enter Time");
        double time = input.nextInt();

        double interest = simpleInterest(principle,rate,time);
        System.out.println("Simple Interest is " + interest + " for Principal " + principle+" Rate of Interest " + interest + " and Time " + time);
    }
}
