import java.util.Scanner;

public class PhyMathChem {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter Number");
    int num = input.nextInt();
    double [] percent = new double[num];
    String [] grades = new String[num];
    int [] phy = new int [num];
     int [] chem = new int [num];
     int [] math = new int [num];

     int[] num1 = new int[3];
    for (int i=0 ; i< num ; i++){
        System.out.println("Enter Physics");
        num1[0]= input.nextInt() ;
        System.out.println("Enter Chemistry");
        num1[1] = input.nextInt();
        System.out.println("Enter Maths");
        num1[2] = input.nextInt();
        if(num1[0] < 0 || num1[1] < 0 || num1[2] < 0){
            System.out.println("Invalid");
            i--;

            continue;
        }
        phy[i] = num1[0];
        chem[i] =num1[1];
        math[i] = num1[2];
    }
    double total = 300;
    for(int i = 0; i< num; i++){
        int sum = 0;
        // sum += marks[i][0] + marks[i][1] + marks[i][2];
        sum += phy[i] + math[i] + chem[i];

        percent[i] = sum / total * 100;
        grades[i] = percent[i] >= 80 ? "A" : percent[i] >= 70 ? "B" : percent[i] >= 60 ? " C": percent[i] >= 50 ? "D" : percent[i] > 40 ? "E" :"R" ; 

     }
     for(int i = 0; i< num; i++){
            System.out.println("Student " + (i+1) + " p " + phy[i] + " C " + chem[i] + " M " + math[i] + " Percent "+ percent[i] + " Grade " + grades[i] );

     }

    // System.out.println(Arrays.deepToString(marks).replace("], ", "]\n"));


 }   
}
