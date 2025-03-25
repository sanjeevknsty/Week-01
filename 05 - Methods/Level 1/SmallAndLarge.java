import java.util.Scanner;
public class SmallAndLarge {
    public static int[] smallLarge(int num1 ,int num2, int num3){
        int small = num1 < num2 ? num1 : num2 < num3 ? num2 : num3;
        int large = num1 > num2 ? num1 : num2 > num3 ? num2 : num3;
        return new int[] {small, large};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2");
        int num2 = input.nextInt();
        System.out.println("Enter Number 3");
        int num3 = input.nextInt();

        int[] arr = smallLarge(num1,num2 ,num3);

        System.out.println("Small Number " + arr[0] + " Large Number " + arr[1]);
    }
}
