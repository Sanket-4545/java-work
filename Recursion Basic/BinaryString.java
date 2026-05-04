public class BinaryString {
    public static int printBinStr(int n, int lastplace, String str) {
        if (n == 0) {
            System.out.println(str);
            return 1;
        }
        
        int count = 0;
        if (lastplace == 0) {
            count += printBinStr(n-1, 0, str + "0");
            count += printBinStr(n-1, 1, str + "1");
        }  
        else {
            count += printBinStr(n-1, 0, str + "0");
        }
        
        return count;
    }
    public static void main(String[] args) {
        System.out.println(printBinStr(1, 0, ""));
    }
}
