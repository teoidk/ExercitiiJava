import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void printeazaMatriceaCompleta(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
    }
    public static void printeazaDiagonalaPrincipala(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("(" + i + ", " + j + ") ");
                } else {
                    System.out.print("( ) ");
                }
            }
            System.out.println();
        }
    }
    public static void printeazaDiagonalaSecundara(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) {
                    System.out.print("(" + i + ", " + j + ") ");
                } else {
                    System.out.print("( ) ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int n = scanner.nextInt();
        printeazaMatriceaCompleta(n);
        printeazaDiagonalaPrincipala(n);
        printeazaDiagonalaSecundara(n);

    }
}