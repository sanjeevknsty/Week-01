import java.util.Scanner;

public class ConvertKmToMiles {
    public static double convertKmToMiles(double km){
        return  km * 0.621371;
    }
    public static double convertMilesToKm(double miles){
        return  miles * 1.60934;
    }
    public static double convertMetersToFeet(double meter){
        return  meter * 3.28084;
    }
    public static double convertFeetToMeters(double feet){
        return  feet *  0.3048;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter KM");
        double km = input.nextDouble();
        double miles = convertKmToMiles(km);
        System.out.println("convertKmToMiles "+miles);
        double kiloMeter =convertMilesToKm(miles) ;
        System.out.println("convertMilesToKm "+kiloMeter);

        double feet = convertMetersToFeet(km * 1000);
        System.out.println("convertMetersToFeet " + feet );

        double meter = convertFeetToMeters(feet);
        System.out.println("convertFeetToMeters "  + meter);

    }
}
