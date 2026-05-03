public class OptimazedPower {
    public static int OptPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = OptPower(a, n/2) ;
        int halfPowerSq = halfPower * halfPower ;

        if ( n % 2 != 0) {
            halfPowerSq = a * halfPowerSq ;
        }
        return halfPowerSq ;
    }
    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        System.out.println(OptPower(a, n));
    }
}
