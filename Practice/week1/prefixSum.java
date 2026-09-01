public class prefixSum {
    public static int  prefixsum(int arr[],int sum){
        int L = 2;
        int R = 5;
        for(int i = L ; i <= R; i++ ){
         sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,5,7,9,8,6,7};
     
      System.out.print(prefixsum(arr, 0));  
    }
}
