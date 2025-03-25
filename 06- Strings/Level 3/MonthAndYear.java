import java.util.Arrays;
import java.util.Scanner;

public class MonthAndYear {
    public static String getMonth(int month){
        String [] monthArr = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        return monthArr[month-1];
    }

    public static int getDays(int month,int year){
        int [] daysArr = {31,28,31,30,31,30,31,31,30,31,30,31};
        boolean leap = false;
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 ==0)
                    leap = true;
            }
            leap = true;
        }
        if(leap){
            daysArr[1] = 29;
        }
        return daysArr[month-1];
    }

    public static String getFirstDay(int month,int year,int day){
        int y = year - (14 - month) /12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14-month)/12)-2;
        int d = (day + x + (31 * m)/12) % 7;
        System.out.println(d);
        String[] weekDays = {"Sat","Sun","Mon","Tue","Wed","Thu","Fri"};
        return  weekDays[d];
    }

    public static void calender(String firstDay,int day){
        String[] weekDays = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        System.out.println(Arrays.toString(weekDays));
        for (int i =0 ;i<weekDays.length ; i++)
            System.out.printf("%3s",weekDays[i]);
        System.out.println();
        int count = 1;
        for (int i =0 ; i< 7;i++){
            if(!weekDays[i].equals(firstDay)){
                System.out.printf("%3s"," ");
                continue;
            }

            for (int j=1 ; j<= day; j++){
                if(count >= j){
                    System.out.printf("%3d",( count++));

                }
                if((j+i) % 7 ==0)
                    System.out.println();

            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");
        int month = input.nextInt();
        System.out.println("Enter Year");
        int year = input.nextInt();

        String monthName = getMonth(month);
        System.out.println("Month " + monthName);
        int day = getDays(month,year);
        System.out.println("Day " + day);

        String firstDay = getFirstDay(month,year,day);
        System.out.println(firstDay);

        calender(firstDay,day);
    }
}
