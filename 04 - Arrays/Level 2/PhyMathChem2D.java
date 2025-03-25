import java.util.Scanner;


public class PhyMathChem2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        int [][] marks = new int[num][3];
        double [] percent = new double[num];
        String [] grades = new String[num];

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
            for(int j = 0 ;j < 3; j++){
                marks[i][j] = num1[j];
            }
        }
        double total = 300;
        for(int i = 0; i< num; i++){
            int sum = 0;
            // sum += marks[i][0] + marks[i][1] + marks[i][2];
            for(int j = 0 ; j < 3 ; j++){
                sum+= marks[i][j];
            }


            percent[i] = sum / total * 100;
            grades[i] = percent[i] >= 80 ? "A" : percent[i] >= 70 ? "B" : percent[i] >= 60 ? " C": percent[i] >= 50 ? "D" : percent[i] > 40 ? "E" :"R" ;


        }
        for(int i = 0; i< num; i++){
            System.out.println("Student " + (i+1) + " p " + marks[i][0] + " C " + marks[i][1] + " M " + marks[i][2] + " Percent "+ percent[i] + " Grade " + grades[i] );


        }


        // System.out.println(Arrays.deepToString(marks).replace("], ", "]\n"));




    }
}
