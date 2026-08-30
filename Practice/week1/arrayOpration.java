import java.util.*;
public class arrayOpration {
// --1--
    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void LinearSearch(int arr[],int key){
            for(int i = 0 ; i<arr.length; i++){
                if (key == arr[i]) {
                System.out.println("Key is found at index:"+arr[i]);
                }else{
                    System.out.println("Key is not found");
                }
            }
    }

    public static void secondLarge(int arr[]){
       int large = arr[0];
       int secondLarge= arr[0];
        for(int i= 0 ; i<arr.length;i++){
            if(large < arr[i]){
                secondLarge = large;
                large = arr[i];
            }
           
        }
         System.out.print("Largest: " + large + ", Second Largest: " + secondLarge);
    }
    
    public static void main(String[] args) {
        int arr[] = {15, 12, 20, 24, 25};

        // reverseArray(arr);
        // System.out.println(Arrays.toString(arr));

        // LinearSearch(arr, 3);

        secondLarge(arr);
    }
}