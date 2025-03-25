import java.util.Random;

public class RandomValues {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // Ensures a 4-digit number
        }
        return numbers;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new double[]{sum / (double) numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);
        double[] stats = findAverageMinMax(randomNumbers);

        System.out.println("Random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage: " + stats[0] + ", Min: " + stats[1] + ", Max: " + stats[2]);
    }
}
