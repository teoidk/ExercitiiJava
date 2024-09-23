import java.util.Scanner;

public class Main {

        // Metodă pentru a inversa un string
        public static String reverseString(String input) {
            StringBuilder reversed = new StringBuilder(input);
            return reversed.reverse().toString();
        }

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
                String reversedString = reverseString(originalString);

        System.out.println("Stringul original: " + originalString);
        System.out.println("Stringul inversat: " + reversedString);
    }
}