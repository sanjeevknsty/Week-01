import java.util.Scanner;
import java.util.Arrays;
public class FactorsInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter Number ");
        int maxFactor = 10;
        int num = input.nextInt() ;
        int[] arr = new int[maxFactor];
        int index = 0 ;
        int[] temp;
        for(int i = 1; i < num ; i++){
            // System.out.println(" Enter Number " + (i+1));
            
            if(num  % i == 0){   
                if(index >= maxFactor){
                    maxFactor *=2;
                    System.out.println(" Twiced " + maxFactor);
                    temp = new int[maxFactor];
                    System.arraycopy(arr, 0, temp, 0, arr.length);

                    arr= new int[maxFactor];
                    System.arraycopy(temp, 0, arr, 0, arr.length);


                } 
                
            // System.out.println(maxFactor- ( maxFactor - index));
            arr[maxFactor- ( maxFactor - index++)] = i;
            }
        }
        System.out.println(Arrays.toString(arr));
 
      
        
    }
}