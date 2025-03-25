
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter Weight kg");
        double weight = input.nextDouble();
        System.out.println("Enter Height cm");
        double height = input.nextDouble();
        height = height / 100;
        double BMI = weight /(height * height);
        
        String status  = BMI <= 18.4 ? "UnderWeight" : BMI <=24.9 ? "Normal" : BMI <= 39.9 ?"OverWeight" : "Obese";
        System.out.println("BMI "+BMI +" Status " + status);
        
        
    }
}