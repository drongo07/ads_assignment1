import java.util.Scanner;

public class AverageOfElements {

    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {
            return 0.0;
        }
        return (arr[n - 1] + calculateAverage(arr, n - 1) * (n - 1)) / n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements separated by space:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        double average = calculateAverage(arr, n);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
}
