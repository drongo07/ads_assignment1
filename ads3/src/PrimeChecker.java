import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int n, int divisor) {
        // Base cases
        if (n <= 1) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int n = scanner.nextInt();

        boolean prime = isPrime(n, (int) Math.sqrt(n));
        if (prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is a composite number.");
        }

        scanner.close();
    }
}
