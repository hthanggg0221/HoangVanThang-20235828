import java.util.Scanner;
public class AddTwoMatrices{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = keyboard.nextInt();
        System.out.print("Enter the number of column: ");
        int columns = keyboard.nextInt();

        int matrix1[][] = new int[rows][columns];
        int matrix2[][] = new int[rows][columns];
        int sumMatrix[][] = new int[rows][columns];

        System.out.println("Enter the element of Matrix 1:");
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                matrix1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Enter the element of Matrix 2:");
        for (int i = 0; i < rows; ++i){
            for (int j = 0; j < columns; ++j){
                matrix2[i][j] = keyboard.nextInt();
            }
        }

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j){
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices: ");
        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < columns; ++j){
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}