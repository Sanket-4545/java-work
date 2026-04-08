public class reverse {
    public static void reverseArray(int numbers[]) {
        int start = 0;
        int end = numbers.length -1;

        if (start <end ) {
            int temp = numbers[end];
            numbers[end] = numbers[start] ;
           numbers[start] = temp;
            start++;
            end--;
            
        }
        
    }

    public static void main(String[] args) {
        int numbers[] = {3,5,7,9,12,};
        
        reverseArray(numbers);
        for (int i=0; i<numbers.length -1; i++){
System.out.println(numbers[i] +" ");
        }
    System.err.println();
    }
}
