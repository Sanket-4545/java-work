public class halfPyramidNumber {
    public static void HalfPyramidNumber(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n+1-i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        
    }
   public static void main(String[] args) {
        HalfPyramidNumber(5);
   } 
}
