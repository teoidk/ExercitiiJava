import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceți dimensiunea array-ului: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int max = array[0];
        int min = array[0];

        System.out.println("Introduceți elementele array-ului:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            if(array[i]>max) {
                max = array[i];
            }
            if(array[i]<min) {
                min = array[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += array[i];
        }

        System.out.println("Suma elementelor din array este: " + sum);
        System.out.println("Maximul din array este: " + max);
        System.out.println("Minimul din array este: " + min);
    }
}