import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a month: ");
        int month = scanner.nextInt();
        System.out.print("Enter a day: ");
        int day = scanner.nextInt();

        if ((month >= 3 && day>=20) || (month >= 4 && day<=30) || (month <=6 || day<=20) ) {
            
            System.out.println("Spring Season");
        } 
        else {
            System.out.println("Not Spring Season");
        }

        scanner.close();
    }
}
