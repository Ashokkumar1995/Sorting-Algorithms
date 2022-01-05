import java.util.*;

public class MergeSort{

    public static void merge(int array[], int l, int m ,int r){
        int n1= m- l+1;
        int n2= r-m;

        int left[] =new int[n1];
        int right[]= new int[n2];

        // temporary right and left arrays
        for(int i=0;i<n1;i++){
            left[i]=array[l+i];            
        }

        for(int j=0;j<n2;j++){
            right[j]= array[m+ 1 + j];
        }

        int i=0,j=0;
        int k=l;

        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                array[k]=left[i];
                i++;                
            }
            else{
                array[k]= right[j];
                j++;                
            }

            k++;            
        }

        while(i<n1){
            array[k]=left[i];
            i++;
            k++;
        }

        while(j<n2){
            array[k]=right[j];
            j++;
            k++;
        }

    }

    public static void sort(int array[], int l, int r){

        if(l<r){

            int m=l + (r-l) /2;

            sort(array, l, m);

            sort(array, m+1 , r);

            merge(array, l, m , r);
        }
    }

    public static void printArray(int array[]){
        System.out.println("Array Elements are");
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
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

        sort(inputs, 0, inputs.length-1);       
        printArray(inputs);
    }
}