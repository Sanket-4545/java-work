public class decTobin {
    public static void decTObin(int n) {
        int myNum = n;
        int pow = 0;
        int binNun = 0;
        while (n > 0) {
            int rem = n % 2;
            binNun = binNun +(rem* (int)Math.pow(10,pow));
            pow ++;
            n = n/2;
        }
        System.out.println("the conversion of decimal no." +myNum +" to Bainary is " +binNun);
    }
    public static void main(String[] args) {
     decTObin(11);   
    }
}
