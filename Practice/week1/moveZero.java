import java.util.Arrays;

public class moveZero {

    public static void moveZeroes(int arr[]) {

        int index = 0;

        
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {

        int arr[] = {0, 1, 2, 4, 0, 2, 0};

        moveZeroes(arr);

        System.out.println(Arrays.toString(arr));
    }
}