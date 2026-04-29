public class EvenOrOdd {
    public static void EvenOrOdd(int n) {
        int bitMask = 1;
        if ((n & bitMask ) == 0) {
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
        EvenOrOdd(3);
        EvenOrOdd(4);
        EvenOrOdd(9);
        EvenOrOdd(16);
    }
}
