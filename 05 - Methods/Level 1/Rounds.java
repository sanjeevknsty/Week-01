import java.util.Scanner;
public class Rounds {
    public static double rounds(int s1 , int s2 ,int s3, int dist){
        int total = s1+ s2 +s3;
        double  rounds = (double) (dist *1000)/(total);
        return rounds;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Side 1");
        int side1 = input.nextInt();
        System.out.println("Enter Side 2");
        int side2 = input.nextInt();
        System.out.println("Enter Side 3");
        int side3 = input.nextInt();

        int distance = 5;
        double rounds = rounds(side1,side2,side3,distance);
        System.out.println("Number of Rounds :" + rounds);
    }
}
