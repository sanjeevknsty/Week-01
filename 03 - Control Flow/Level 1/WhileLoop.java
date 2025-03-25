import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CountDown: ");
        int count = scanner.nextInt();
        while(count >=0){
            System.out.println(count--);
        }

        scanner.close();
    }
}
