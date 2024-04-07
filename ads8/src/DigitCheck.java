import java.util.Scanner;

public class DigitCheck {

    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) {
            return true;
        }
        if (Character.isDigit(s.charAt(index))) {
            return isAllDigits(s, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it consists only of digits: ");
        String s = scanner.nextLine();

        if (isAllDigits(s, 0)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
