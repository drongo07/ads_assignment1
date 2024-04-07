import java.util.Scanner;

public class Power {

    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the exponent (n): ");
        int n = scanner.nextInt();

        double result = power(a, n);
        System.out.println(a + " raised to the power of " + n + " is: " + result);

        scanner.close();
    }
}
