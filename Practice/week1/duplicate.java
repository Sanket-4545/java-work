public class duplicate {
 public static int duplicateElement(int arr[]) {
 for (int i = 0; i < arr.length; i++) {
  for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1; // No duplicate found
    }
    public static void main(String[] args) {
          int arr[] = {4, 2, 5, 6, 3, 2, 9};
        int result = duplicateElement(arr);
        System.out.println("Duplicate element: " + result);
    }
}