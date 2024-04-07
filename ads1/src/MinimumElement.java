import java.util.Scanner;

public class MinimumElement {

    public static int findMinimum(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }
        return Math.min(arr[n - 1], findMinimum(arr, n - 1));
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

        int min = findMinimum(arr, n);
        System.out.println("Minimum element: " + min);

        scanner.close();
    }
}
