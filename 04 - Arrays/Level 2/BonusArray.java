import java.util.Arrays;
import java.util.Scanner;
public class BonusArray {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double [] salary = new double[10];
    double [] service = new double[10];
    double [] newSalary = new double[10];
    double [] bonus = new double[10];
    double num1 ;
    double num2 ;
    
    for(int i=0; i< 10;i++){
        System.out.print("Salary " + (i + 1) + " ");
         num1 = input.nextDouble();
        System.out.print("Service " + (i + 1) + " ");
         num2 = input.nextDouble();
        if(num1< 1000 || num2 <= 0){
            System.out.println("Invalid, Enter Again");
            i--;
            continue;
        }
        salary[i] = num1;
        service[i] = num2;
    }
    System.out.println(Arrays.toString(salary));
    System.out.println(Arrays.toString(service));
    
    for(int i = 0 ; i < 10 ;i++){
        if(service[i] >= 5){
            bonus[i] = (salary[i] / 100) * 5;
        }else{
            bonus[i] = (salary[i]/ 100) *  2;
        }
        newSalary[i] = bonus[i] + salary[i];
    }
    
     System.out.println(Arrays.toString(bonus));
    System.out.println(Arrays.toString(newSalary));
    
}
}