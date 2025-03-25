import java.util.Arrays;
import java.util.Scanner;

public class review {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter rows");
        int rows = input.nextInt();
        System.out.println("Enter column");
        int column = input.nextInt();
        int[][] arr = new int[rows][column];
        int[][] revArr = new int[rows][column];

        for (int i =0; i<rows ; i++){
            for (int j =0; j< column ; j++){
                System.out.println("Enter " + i + " " + j);
                arr[i][j] = input.nextInt();
            }
        }

        int sum =0;
        for (int i =0; i<rows ; i++){
            for (int j =0; j< column ; j++){
                sum +=arr[i][j];

            }
        }
        for (int i =0; i<=rows/2 ; i++){
            for (int j =0; j<=(column/2)+1; j++){
                int temp = arr[i][j];
                System.out.println((rows- i - 1) + " " + (column-j-1));
                arr[i][j] = arr[rows-i-1][column-j-1];
                arr[rows-i-1][column-j-1] = temp;
                System.out.println("ARR SORTED" + Arrays.deepToString(arr));
            }
        }
//        for (int i =rows-1; i>=0; i--){
//            for (int j =column-1; j>=0 ; j--){
//                System.out.println((rows- i - 1) + " " + (column-j-1));
//                revArr[rows- i-1 ][column-j-1] = arr[i][j];
//
//            }
//        }

        for (int i =0; i<rows ; i++){
            for (int j =0; j< column ; j++){
                System.out.println(arr[i][j]);

            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(sum);
    }
}
