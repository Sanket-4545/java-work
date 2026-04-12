public class Binomial_Coefficient {

    // function to calculate factorial
    public static int factorial(int n) {
        int n_fac = 1;
        for (int i = 1; i <= n; i++) {
            n_fac = n_fac * i;
        }
        return n_fac;
    }

    // function to calculate nCr
    public static int binCoeff(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static void main(String[] args) {
        System.out.println(binCoeff(5, 2)); // Output: 10
    }
}