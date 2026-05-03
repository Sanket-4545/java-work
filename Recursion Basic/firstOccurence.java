public class firstOccurence {
    public static int FirstOcc(int arr[] , int i ,int key) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return FirstOcc(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,7,8,5};
        System.out.print(FirstOcc(arr,0, 5));
       
    
    }
}
