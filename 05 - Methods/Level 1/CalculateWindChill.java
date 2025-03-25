import java.util.Scanner;

public class CalculateWindChill {
    public double calculateWindChill(double temperature, double windSpeed){
        double chill = 35.74 + 0.6215 *temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed,0.16) ;
        return chill;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wind Speed");
        int speed = input.nextInt();
        System.out.println("Temparature");
        int temp = input.nextInt();
        CalculateWindChill obj = new CalculateWindChill();
        double chill = obj.calculateWindChill(temp,speed);
        System.out.println("wind chill temperature " + chill);

    }
}
