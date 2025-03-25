import java.util.Arrays;
import java.util.Scanner;
public class YoungestFriend {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int [] age = new int[3];
    double [] height = new double[3];

    String[] name = {"Amar", "Akbar", "Antony"};
    
    for(int i=0; i< 3;i++){
        System.out.print("age of " + name[i] + " ");
         age[i] = input.nextInt();
        System.out.print("height of " + name[i] + " ");
         height[i] = input.nextDouble();
        
    }
    System.out.println(Arrays.toString(age));
    System.out.println(Arrays.toString(height));
    int young = 0;
    int tall = 0;
    
    for(int i = 1 ; i < 3 ;i++){
        if(young > age[i]){
            young = i;
        }
        if(tall < height[i]){
            tall = i;
        }
    }
    
     System.out.println("youngest is " + age[young] + " " + name[young]);
    System.out.println("tallest is " + height[tall]+ " " + name[tall]);
    
}
}