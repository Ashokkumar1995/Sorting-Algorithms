import java.util.*;
import java.io.*;

public class InsertionSort {

    public static void printArray(int array[]){
        System.out.println("Array Elements are");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    
    public static void sort(int array[]){
        for(int i=0;i<array.length;i++){
            int j=i-1;
            int key=array[i];
            while(j>=0 && array[j]> key){
                    array[j+1] = array[j];
                    j=j-1;
            }
            array[j+1]=key;
        }
        printArray(array);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size= in.nextInt();
        int[] inputs = new int[size];
        
        System.out.println("enter elements");

        for(int i=0;i<size;i++){
            inputs[i]=in.nextInt();
        }

        sort(inputs);       
    }
   
}
