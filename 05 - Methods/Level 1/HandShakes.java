import java.util.Scanner;

public class HandShakes {
    public  int handShakes(int n){
        int handShakes = (n * (n -1)) /2;
        return handShakes;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        HandShakes obj = new HandShakes();
        int handShakes  = obj.handShakes(num);
        System.out.println("HandShakes " + handShakes);
    }
}
