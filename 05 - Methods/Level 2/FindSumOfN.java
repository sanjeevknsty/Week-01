import java.util.Scanner;

public class FindSumOfN {
    public static int natural(int n){
        if(n==0){
            return 0;
        }
//        System.out.println("sum of Natural number "+n + " "+n*(n+1)/2);
        return n + natural(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int naturalNumber = natural(num);
        if(naturalNumber == num*(num+1)/2){
        System.out.println("Sum of Natural number " + naturalNumber);

        }else {
            System.out.println("Invalid");
        }
        input.close();
    }
}
