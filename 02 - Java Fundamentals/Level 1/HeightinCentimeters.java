import java.util.Scanner;

public class HeightinCentimeters {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.print("Enter height  ");
        double inCm = input.nextDouble();
        double inch = 2.54; 
        int foot = 12;    
        double heightInInches = inCm / inch;
        int heightInFeet = (int) (heightInInches / foot);
        double remainingInches = heightInInches % foot;
        System.out.println("Your height in cm is " + inCm + 
                           ", while in feet is " + heightInFeet + 
                           " and inches is " + remainingInches);
        input.close();
    }
}