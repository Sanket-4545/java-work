public class PrintEvenNumber {
    public static void EvenNumber(int n) {
        if (n == 0) {
            System.out.println(n);
            return;
        }
        System.out.print((n % 2)==0 ? n + " " : "");
        EvenNumber(n-1);
    }
   public static void main(String[] args) {
    int n = 20;
    EvenNumber(n);
   } 
}
