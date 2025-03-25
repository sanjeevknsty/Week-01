import java.util.Scanner;

public class BodyMassIndex {
    public static double calculateBMI(double weight, double heightCm) {


        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 24.9) return "Normal weight";
        if (bmi < 29.9) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] bmiData = new double[10][3];
        String[] statuses = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            bmiData[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            bmiData[i][1] = sc.nextDouble();

            bmiData[i][2] = calculateBMI(bmiData[i][0], bmiData[i][1]);
            statuses[i] = getBMIStatus(bmiData[i][2]);
        }

        System.out.println("\nHeight(cm) | Weight(kg) | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f       | %.2f       | %.2f | %s%n",
                    bmiData[i][1], bmiData[i][0], bmiData[i][2], statuses[i]);
        }
        sc.close();
    }
}
