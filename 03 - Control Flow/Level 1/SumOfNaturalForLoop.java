import java.util.Scanner;

public class SumOfNaturalForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = scanner.nextInt();
        int sum= 0;
        for(int i =0; i<=n ;i++){
            sum +=i;
        }
        int total = n*(n+1)/2;
        if (total == sum ) {
                
            System.out.println("Total "+total +" and sum " + sum+ " are Same");
            }


        scanner.close();
    }
}
