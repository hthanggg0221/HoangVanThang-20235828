import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int array[];
        int temp;
        System.out.print("Enter the number element of array: ");
        int arraySize = keyboard.nextInt();
        array = new int[arraySize];
        System.out.println("Enter the value of each element:");
        for (int i = 0; i < arraySize; ++i){
            System.out.print("a[" + i + "]: ");
            array[i] = keyboard.nextInt();
        }
        for (int i = 0; i < arraySize - 1; ++i){
            for (int j = i + 1; j < arraySize; ++j){
                if (array[j] < array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        int sum = 0;
        for (int arr : array){
            sum += arr;
        }
        double average = (double)sum / arraySize;
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array: " + sum);
        System.out.println("Average of array: " + average);
        keyboard.close();
    }
}