import java.util.Scanner;

public class XandZeroGame {


    public static void displayMatrix(int[][] matrix){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void displayMatrixPosition(int[][] matrix){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {

        System.out.println("Welcome to the X and 0 game");


        int[][] matrix = new int[3][3];
        displayMatrix(matrix);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Player 1 - Choose X or 0: ");
        char a = scanner.next().charAt(0);
        System.out.println("The choise is " + a + "." + "Please choose which position you want to complete:");

        int value = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = value;
                value++;
            }
        }
        displayMatrixPosition(matrix);

        char b = scanner.next().charAt(0);
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(matrix[i][j] == b)
                {
                   matrix[i][j] = a;
                   System.out.print(matrix[i][j]);
                }
            }
        }








    }
}