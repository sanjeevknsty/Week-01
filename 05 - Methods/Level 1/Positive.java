import java.util.Scanner;

public class Positive {
    public static int checkNumber(int num){
        if(num < 0){
            return -1;
        }else if(num > 0){
            return 1;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();

        int result = checkNumber(num);
        System.out.println(result);

    }
}
