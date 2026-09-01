public class prefixnewarray {
    public static void prefix(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i = 0 ; i < prefix.length; i++){
            System.out.print((prefix[i]) + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,7,9,13};
    prefix(arr);
    }
}
