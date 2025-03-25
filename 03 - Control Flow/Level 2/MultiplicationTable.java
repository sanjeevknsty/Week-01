import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 6 to 9");
        int num = input.nextInt();
        if (num >= 6 && num <=9 ){
            for ( int i =1 ; i<=10 ; i++){
                System.out.println(num + "*" + i +" = " + num*i);
            }
        }else{
        System.out.println("No Bonus");
    }
    }
}