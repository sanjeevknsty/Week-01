import java.util.Scanner;

public class Youngest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the age of Amar");
        int ageAmar = scanner.nextInt();
        System.out.println("Enter the height of Amar: ");
        int heightAmar = scanner.nextInt();
        
        
        System.out.println("Enter the age of Akbar ");
        int ageAkbar = scanner.nextInt();
         System.out.println("Enter the height of Akbar ");
        int heightAkbar = scanner.nextInt();
        
        System.out.println("Enter the age of Anthony ");
        int ageAnthony = scanner.nextInt();
        System.out.println("Enter the height of Anthony  ");
        int heightAnthony = scanner.nextInt();

        int young = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (young == ageAmar) ? "Amar" :
                                (young == ageAkbar) ? "Akbar" : "Anthony";

        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar" :
                                (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        System.out.println("youngest " + youngestFriend + "age " + young);
        System.out.println("tallest" + tallestFriend + " height " + tallestHeight + " cm");

        scanner.close();
    }
}
