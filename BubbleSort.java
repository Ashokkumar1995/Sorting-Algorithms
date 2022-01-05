import java.io.*;
import java.util.*;

public class BubbleSort {
    
    public static void printArray(int array[]){
        System.out.println("Array Elements are");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

    public static void sort(int array[]){
        for(int i=0;i<array.length;i++){
            int swapped=0,temp;
            for(int j=1;j<array.length;j++){
                if(array[j-1] > array[j])
                    {
                        temp= array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp;
                        swapped=1;
                    }
            }
            if(swapped==0)
                break;
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
