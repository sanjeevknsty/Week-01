import java.util.Scanner;

public class CalculateTrigonometricFunctions {
    public double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        System.out.println(radians);
        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);
        return new double[] {sin,cos,tan};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Angle");
        double angle = input.nextDouble();
        CalculateTrigonometricFunctions obj = new CalculateTrigonometricFunctions();
        double [] arr = obj.calculateTrigonometricFunctions(angle);
        System.out.println( "Sin " + arr[0] + " Cos " + arr[1] + " Tan " + arr[2]);
    }
}