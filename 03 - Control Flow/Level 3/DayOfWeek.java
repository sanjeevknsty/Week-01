public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
		
		int year = y - (14-m) /12;
		int x = year + (year / 4) - (year/100) + (year/400) ;
		int month = m + 12 * ((14-m) / 12) - 2;
		int day = (d + x + (31 *month)/12) % 7 ;
		
		System.out.println(day);
    }
}
