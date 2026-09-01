public class frequencyOfElement {
    public static int frequency(int arr[], int element) {
      int count = 0;
        for (int i = 0; i < arr.length; i++) {
         if (arr[i] == element) {
         count++;
           }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 5, 6, 3, 2, 9};
     int result = frequency(arr, 2);
        System.out.println("Frequency of element: " + result);
    }
}