public class TilingProblem {
public static int tilingProblem(int n) {
    if (n == 0 || n ==1) {
        return 1;
    }
    // vartically tiling
    int fnm1 = tilingProblem( n - 1 );
// Horizontl tiling
int fnm2 = tilingProblem(n - 2);

int totalway = fnm1 + fnm2 ;
 
return totalway;
}
    public static void main(String[] args) {
        
        System.out.println(tilingProblem(5));
    }
}