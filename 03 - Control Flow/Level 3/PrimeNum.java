import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        boolean prime = true;
        for(int i = 2 ; i <num ; i++){
            if(num % i == 0){
                prime = false;
                break;
            }
        }
        System.out.println(prime);
    }
}