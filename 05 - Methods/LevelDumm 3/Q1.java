import java.util.Scanner;

public class Q1 {

    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    public static double findMean(int[] heights) {
        return findSum(heights) / (double) heights.length;
    }

    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) min = h;
        }
        return min;
    }

    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) max = h;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];

        System.out.println("Enter heights of 11 players (in cm):");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextInt();
        }

        System.out.println("Mean Height: " + findMean(heights) + " cm");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");


    }
}
