import java.util.*;
import java.io.*;

public class QuickSort {

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static int partition(int array[], int low, int high) {
        int i = low - 1;
        int pivot = array[high];

        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void sort(int array[], int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }
    }

    public static void printArray(int array[]) {
        System.out.println("Array Elements are");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = in.nextInt();
        int[] inputs = new int[size];

        System.out.println("enter elements");

        for (int i = 0; i < size; i++) {
            inputs[i] = in.nextInt();
        }

        sort(inputs, 0, inputs.length - 1);
        printArray(inputs);
    }

}