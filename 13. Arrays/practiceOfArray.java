import java.util.*;

public class practiceOfArray {

    public static int sum(int arr[]) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
        }
        return total;
    }
    public static int maxElement(int arr[]){
        int max = 0; 
        for(int i = 0 ; i<arr.length ; i++){
            if (arr[i]>max) {
               max = arr[i]; 
            }
        
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 9, 6};

        // Print elements of array
        System.out.println("Elements of array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Sum of elements of array
        int result = sum(arr);
        System.out.println("Sum of array elements: " + result);

        int Max = maxElement(arr);
        System.out.println("Max element of array is: " + Max);
    }
}