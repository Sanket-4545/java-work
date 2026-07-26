public class maxSubarrayKadanes {
    public static void maxSubarrayKadane(int numbers[]) {
        int currSum = 0; 
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0 ; i<numbers.length; i++){
            if (currSum < 0){
                currSum = 0;
            }
            currSum += numbers[i];
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, -8, 10 };
        maxSubarrayKadane(numbers);
        
    }
}