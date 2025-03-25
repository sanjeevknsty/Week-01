import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CountDown: ");
        int count = scanner.nextInt();
        for( int i =count ; i>= 0 ;i--){
            System.out.println(i);
        }

        scanner.close();
    }
}
