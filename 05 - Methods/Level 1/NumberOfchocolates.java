import java.util.Scanner;

public class NumberOfchocolates {
    public static int[] checkChoc(int chocolates , int children) {
    int childGets = chocolates/children;
    int remaining = chocolates - (childGets * children) ;

    return new int[] {childGets,remaining};

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("number Of chocolates");
        int numberOfchocolates  = input.nextInt();
        System.out.println("number Of Children");
        int numberOfChildren = input.nextInt();

        int[] arr = checkChoc(numberOfchocolates,numberOfChildren);
        System.out.println("number of chocolates each child gets " + arr[0] + " Remaining " + arr[1]);


        input.close();
    }
}
