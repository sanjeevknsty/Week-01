import java.util.Scanner;
import java.util.Arrays;
public class MultidimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter rows ");
        int rows = input.nextInt() ;
        System.out.println(" Enter columns ");
        int columns = input.nextInt() ;
       int matrix[][] = new int[rows][columns];
       int arr[] = new int[rows * columns];
        for(int i = 0 ; i< rows ; i++){
            for(int j =0 ; j< columns ; j++){
                System.out.println("matrix " + i+" " + j);
               matrix[i][j] = input.nextInt();
            }
        }
        
       Arrays.stream(matrix).forEach(row -> {
            System.out.println(Arrays.toString(row));
        });
        int index = 0;
        for(int i = 0 ; i< rows ; i++){
            for(int j =0 ; j< columns ; j++){
                arr[index++] = matrix[i][j];
            }
        }
      
        System.out.println(Arrays.toString(arr));
    }
}