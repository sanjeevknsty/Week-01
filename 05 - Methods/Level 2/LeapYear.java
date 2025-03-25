import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year){
        if(year <= 1582){
            return false;
        }
            return ((year % 4 == 0) && (year % 100 !=0) || (year % 400 ==0) );
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = input.nextInt();
        boolean isLeap = checkLeapYear(year);
        if(isLeap){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
