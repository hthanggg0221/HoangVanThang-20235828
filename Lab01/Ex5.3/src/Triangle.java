import java.util.Scanner;

public class Triangle{
    public static void main(String args[]){
        Scanner screen = new Scanner(System.in);
        int k = 0;
        System.out.println("Enter the number of rows to be printed");
        int n = screen.nextInt();
        for (int i = 1; i <= n; ++i, k = 0) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            while (k != (2 * i - 1)) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
        screen.close();
    }
}