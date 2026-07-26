import java.util.*;

public class max_subArrar {

    public static void maxarray(int numbers[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currSum = 0;

                for (int k = start; k <= end; k++) {
                    currSum += numbers[k];

                }
                if (currSum > maxsum) {
                    maxsum = currSum;

                }
                System.out.println("Subarray sum: " + currSum);

            }

            System.out.println("Max so far: " + maxsum);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        maxarray(numbers);
    }
}
