public class LargestNumber {
    public static int largestNumber(int number[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > largest) {
                largest = number[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int number[] = {1,3,4,7,8,78};
        System.out.println("The largest number is: " + largestNumber(number));
    }
}
