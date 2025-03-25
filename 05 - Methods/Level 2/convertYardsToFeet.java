import java.util.Scanner;

public class convertYardsToFeet {
    public static double convertYardsToFeet(double yards){
        return  yards * 3;
    }
    public static double convertFeetToYards(double feet){
        return  feet * 0.333333;
    }
    public static double meters2inches (double meter){
        return  meter * 39.3701;
    }
    public static double inches2meters (double inches){
        return  inches *   0.0254;
    }
    public static double inches2cm (double inches){
        return  inches *  2.54;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yards");

        double yards = input.nextDouble();

        double feet = convertYardsToFeet(yards);
        System.out.println("convertYardsToFeet "+ feet);

        double yard = convertFeetToYards(feet);
        System.out.println("convertFeetToYards "+yard);

        double inch =meters2inches(yards * 0.9144 ) ;
        System.out.println("meters2inches "+inch);

        double meter = inches2meters(inch);
        System.out.println("inches2meters " + meter );

        double cm = inches2cm (inch);
        System.out.println("inches2cm  "  + cm);

    }
}
