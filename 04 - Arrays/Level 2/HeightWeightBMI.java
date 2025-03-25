import java.util.Arrays;
import java.util.Scanner;
public class HeightWeightBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = input.nextInt();
        double[][] personData = new double[num][3];
        String[] weightStatus = new String[num];
        int num1 ;
        double num2 ;

        for(int i=0 ; i< num; i++){
            // for(int j=0 ; j< 2; j++){
            System.out.print("Enter Weight " + (i+1) + " ");
            num1 = input.nextInt();
            System.out.print("Enter Height " + (i+1) + " ");
            num2= input.nextDouble();
            if(num1 < 0 || num2<0){
                System.out.println("Invalid");
                i--;
                continue;
            }
            personData[i][0] = num1;
            personData[i][1] = num2;
        }

        for(int i=0 ; i< num; i++){
            System.out.println("Person " + (i+1) );
                personData[i][2] = personData[i][0]/(personData[i][1]/100 * personData[i][1]/100);

            weightStatus[i] = personData[i][2] <= 18.4 ? "UnderWeight" : personData[i][2] <= 24.9 ? "Normal" : personData[i][2] <= 39.9 ? "OverWeight" : "Obese";
            System.out.println((i+1)+" Height "+personData[i][1] + " weight " + personData[i][0] + "  personData " + personData[i] + " Status " + weightStatus[i]);
                System.out.print("Enter Weight " + (i+1) + " ");
        }
        
        System.out.println(Arrays.deepToString(personData).replace("], ", "]\n"));
    }
}
