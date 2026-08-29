import java.util.*;
public class practiceOfArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 6};

        //print elements of array
//  System.out.println( "Elements of array are: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println( arr[i]);
//         }
        //Sum of elements of array
        int sum = 0;
        for(int i = 0; i<arr.length ; i++){
            sum = sum + i;
            System.out.println(sum);
        }
    }
}