public class bubbleSort {
    public static void bubbleSort(int arr[]){

    for(int turm =0; turm<arr.length-1; turm++){
        for(int j = 0; j<arr.length-1-turm; j++){
           if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
           }
        }
    }
    }
    public static void main(String[] args) {
        int arr[] ={ 5,3,4,2,1};
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        

    }
}
