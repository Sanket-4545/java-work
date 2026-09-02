public class arrangePovandNegnumber {

    public static void main(String[] args) {

        int arr[] = {2, -3, 4, -2, 5, -7, 8};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // Left is already negative → move forward
            if (arr[left] < 0) {
                left++;
            }

            // Right is positive → move backward
            else if (arr[right] >= 0) {
                right--;
            }

            // Left is positive and right is negative → swap
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}