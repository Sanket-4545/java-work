public class PrintNumberIncresionOrder {
    public static void IncresingOrder(int n) {
        if (n == 1){
            System.out.print(n+ " ");
            return;
        }
        IncresingOrder(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        int n = 10;
      IncresingOrder(n);
    }
}
