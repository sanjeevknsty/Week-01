import java.util.Scanner;

public class BMIStatus {
    public static String[][] BMI(double[][] arr,int n){
        String[][] bmiStatus = new String[n][4];
        for (int i =0 ; i< n ; i++){
            double weight = arr[i][0]  ;
            bmiStatus[i][0] = String.valueOf(weight);
            double height = arr[i][1] /100 ;
            bmiStatus[i][1] = String.valueOf(height);
            double bmi = weight /(height * height);
            bmiStatus[i][2] = String.valueOf(bmi);
            System.out.println(bmi);
            String status = bmi <= 18.4 ? "UnderWeight" : bmi <= 24.9 ? "Normal" : bmi <= 39.9 ? "OverWeight" : "Obese";
            bmiStatus[i][3] = status;
        }
        return bmiStatus;
    }

    public static void display(String[][] arr,int n){
        for (int i =0 ; i< n ; i++){
            System.out.println( arr[i][0] + " " + arr[i][1] + " " + arr[i][2] + " " + arr[i][3]);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [][] arr = new double[10][2];
        int n =3;
        for (int i=0 ;i< n ;i++){
            System.out.println("Enter Weight");
            arr[i][0] = input.nextDouble();
            System.out.println("Enter Height");
            arr[i][1] = input.nextDouble();
        }
        String[][] bmiStatus = BMI(arr,n);

        display(bmiStatus,n);

    }
}
