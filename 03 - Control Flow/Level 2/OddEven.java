import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        System.out.println("Enter Number");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i =1; i<=num ; i++){
            if (i % 2 == 0){
            System.out.println("num is " + i + " even");
            }else{
            System.out.println("num is " + i + " odd");
                
        }
    }
    }
}