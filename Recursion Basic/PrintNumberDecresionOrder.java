public class PrintNumberDecresionOrder {

    public static void DecOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;

        }
        System.out.print(n + " ");
        DecOrder(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        DecOrder(n);
    }
}