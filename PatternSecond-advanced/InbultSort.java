import java.util.Arrays;
public class InbultSort {
   int  arr[] = { 2,5,4,3,1};
   public static void main(String[] args) {
      int[] arr = { 2,5,4,3,1};
    //   Arrays.sort(arr);
    Arrays.sort(arr , 0,3);
        for(int i = 0; i<arr.length; i++){
             System.out.print(arr[i]+" ");
        }
   }
}
