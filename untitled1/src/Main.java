import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = scanner.nextInt();
        if (n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0) {
            System.out.println("Numarul este prim ");
        } else {
            System.out.println("Numarul nu este prim ");
        }
    }
}