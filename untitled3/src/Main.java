import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class Palindrom {
        public static boolean isPalindrome(int number) {
            // Dacă numărul este negativ, nu poate fi palindrom
            if (number < 0) {
                return false;
            }

            int originalNumber = number;
            int reversedNumber = 0;

            // Inversăm numărul
            while (number != 0) {
                int a = number % 10; // Obținem ultima cifră
                reversedNumber = reversedNumber * 10 + a; // Construim numărul inversat
                number /= 10; // Eliminăm ultima cifră
            }

            // Comparam numărul original cu numărul inversat
            return originalNumber == reversedNumber;
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
            if (Palindrom.isPalindrome(number)) {
                System.out.println(number + " este un palindrom.");
            } else {
                System.out.println(number + " nu este un palindrom.");
            }
        }
}