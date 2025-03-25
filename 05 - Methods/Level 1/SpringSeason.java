import java.util.Scanner;
public class SpringSeason {
    public static boolean spring(int month , int day){
        return (month >= 3 && day >= 20) && (month >= 4 && day<=30) && (month <= 6 && day <= 20) ? true : false;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Month");
        int month = input.nextInt();
        System.out.println("Enter Day");
        int day = input.nextInt();

        boolean isSpring = spring(month,day);
        if(isSpring){
            System.out.println("Spring Season");
        }else {
            System.out.println("Not Spring");
        }
        input.close();
   }
}
