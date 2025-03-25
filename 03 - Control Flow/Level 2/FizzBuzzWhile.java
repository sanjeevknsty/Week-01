import java.util.Scanner;
public class FizzBuzzWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = input.nextInt();
        if(num > 0 ){
           int i = 1;
            while(i <=num){
                if(i % 3 ==0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i % 5 ==0){
                System.out.println("Buzz");
            }else if (i % 3 ==0){
                System.out.println("Fizz");
            } 
            i++;
            }
        }
    }
}