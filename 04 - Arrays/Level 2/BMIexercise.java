import java.util.Scanner;
public class BMIexercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();
        int[] weight = new int[num];
        double[] height = new double[num];
        double[] BMI = new double[num];
        String []status = new String[num];

        for(int i=0 ; i< num; i++){
            System.out.print("Enter Weight " + (i+1) + " ");
            weight[i] = input.nextInt();
            System.out.print("Enter Height " + (i+1) + " ");
            height[i] = input.nextDouble();
        }
        for(int i =0 ; i<num ;i++){
            // System.out.println((height[i] * height[i]));

            BMI[i] = weight[i]/(height[i]/100 * height[i]/100);
            status[i] = BMI[i] <= 18.4 ? "UnderWeight" : BMI[i] <= 24.9 ? "Normal" : BMI[i] <= 39.9 ? "OverWeight" : "Obese";
            System.out.println((i+1)+" Height "+height[i] + " weight " + weight[i] + "  BMI " + BMI[i] + " Status " + status[i]);
        }
    }
}
