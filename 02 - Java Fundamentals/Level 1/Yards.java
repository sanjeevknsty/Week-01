import java.util.Scanner;

public class Yards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance  ");
        double feet = scanner.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;
        System.out.println("Distance in yards is " + yards + 
                           " and in miles is " + miles);
        scanner.close();
    }
}
