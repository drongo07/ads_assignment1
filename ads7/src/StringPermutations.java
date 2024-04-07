import java.util.Scanner;

public class StringPermutations {

    public static void generatePermutations(String prefix, String remaining) {
        if (remaining.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < remaining.length(); i++) {
                generatePermutations(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to generate permutations: ");
        String input = scanner.nextLine();

        generatePermutations("", input);

        scanner.close();
    }
}
