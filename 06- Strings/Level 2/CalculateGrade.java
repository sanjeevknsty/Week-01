import java.util.Scanner;

public class CalculateGrade {

    public static int randMarks(){
        int choice = (int) ((Math.random()*98 )+ 1);
        return choice;
    }

    public static void average(int[] math, int[] phy,int[] chem,int n){

        double [][] arr = new double[n][3];

        for (int i = 0 ; i < n ; i++){
            double total =   math[i] + phy[i] + chem[i];
            arr[i][0] = total;
            double avg = Math.round(total/3) ;
            arr[i][1] = avg;
            double percent = Math.round((total / 300) * 100);
            arr[i][2] = percent;
            char grade = calculateGrade(percent);

            System.out.println(total + " " + avg + " " + percent + " " + grade);

        }


    }

    public  static char calculateGrade(double percent){

        return percent >=80 ? 'A' : percent >=80 ? 'A' : percent >=70 ? 'B' : percent >=60 ? 'C' : percent >=50 ? 'D' : percent >=40 ? 'E' : 'F';
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Number of Students");
        int n = input.nextInt();

        int loop = n;
        int[] phy= new int[n] ;
        int[] math = new int[n];
        int[] chem = new int[n];
        for (int i =0 ; i< n ;i++){
             phy[i] = randMarks();
            math[i] = randMarks();
            chem[i] = randMarks();

        }
        average(phy,math,chem,n);
    }
}
