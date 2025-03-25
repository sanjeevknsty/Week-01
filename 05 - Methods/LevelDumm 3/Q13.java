import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Q13 {

    public static int[][] createMatrix(int rows,int columns){
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[rows][columns];
        for(int i =0 ; i< rows ;i++){
            for (int j=0 ; j< columns ; j++){
                System.out.println("Enter " + i + " " + j);
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void addMatrix(int[][] matrix1 , int[][] matrix2,int rows , int columns){
        int [][]  add= new int[rows][columns];
        for (int i =0 ;i < rows ; i++){
            for (int j =0; j< columns ; j++){
                add[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix Subtraction"+Arrays.deepToString(add));

    }

    public static void subtractMatrix(int[][] matrix1 , int[][] matrix2,int rows , int columns){
        int [][]  sub= new int[rows][columns];
        for (int i =0 ;i < rows ; i++){
            for (int j =0; j< columns ; j++){
                sub[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Matrix Subtraction"+Arrays.deepToString(sub));

    }


    public static void multiplyMatrix(int[][] matrix1 , int[][]matrix2){
        int rows = matrix1.length;
        System.out.println("rows" + rows);
        int columns = matrix2[0].length;
        System.out.println("col" + columns + " " + matrix1[0].length);
        int[][] multiply = new int[rows][columns];
        int product = 1;
        for (int i= 0; i< rows; i++){
            for (int j =0; j< columns;j++){
                for(int k =0 ; k< matrix1[0].length ;k++){
                    multiply[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println(Arrays.deepToString(multiply));

    }

    public static void transpose(int[][] matrix, int rows, int columns){
        int[][] trans = new int[rows][columns];
        for (int i= 0 ;i< rows ;i++){
            for(int j =0 ;j< columns ;j++){
                trans[i][j] = matrix[j][i];
            }
        }
        System.out.println("Transpose "+Arrays.deepToString(trans));
    }

    public static void determinantFor2(){
        int[][] matrix = createMatrix(2,2);

        System.out.println("Determeinent " + ((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]) ));

    }

    public static void determinantFor3(){
//        int[][] matrix = createMatrix(3,3);
        int[][] matrix = {
                {1, 2, 3},
                {0, 1, 4},
                {5, 6, 0}
        };
        int[][] det = new int[3][3];
        for (int i =0; i< 3; i++){
            for(int j=0 ;j < 3; j++){
                int [][] sub = new int[2][2];
                for (int x =0; x < 3; x++){
                    int m = 0;
                    int n =0;
                    for(int y=0 ;y < 3; y++){
                        if (x==i || y ==j )continue;
//                        if (x-1 < 0) m=0;
                        sub[x-1 > 0 ? x-1  : 0][n++] = matrix[x][y];
                        System.out.print("x " + x + " y " + y+ "  ");

                    }
                    System.out.println();
                }
                System.out.println(Arrays.deepToString(sub));
                System.out.println("Determenant "+ (det[0][0] - det[0][1]+ det[0][2]));
                det[i][j] =((sub[0][0] * sub[1][1]) - (sub[0][1] * sub[1][0]));
            }
        }
        System.out.println(Arrays.deepToString(det));
    }

    public static void main(String[] args) {
        determinantFor3();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Rows Matrix 1");
        int row = input.nextInt();
        System.out.println("Enter columns Matrix 1");
        int column = input.nextInt();
        int[][] matrix1 = createMatrix(row,column);
        System.out.println(Arrays.deepToString(matrix1));


        System.out.println("Enter Rows Matrix 2");
        int row2 = input.nextInt();
        System.out.println("Enter columns Matrix 2");
        int column2 = input.nextInt();
        int[][] matrix2 = createMatrix(row2,column2);
        System.out.println(Arrays.deepToString(matrix2));

        if(row2 == row && column == column2) {
            addMatrix(matrix1,matrix2,row,column);
            subtractMatrix(matrix1,matrix2,row,column);
        }else {
            System.out.println("Addition and subtraction Not possible, rows and columns are diff");
        }

        multiplyMatrix(matrix1,matrix2);

        transpose(matrix1,row,column);
        transpose(matrix2,row2,column2);


    }
}
