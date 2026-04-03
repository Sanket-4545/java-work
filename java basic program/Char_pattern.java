public class Char_pattern {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for(int line = 1; line <= n ; line ++){
            for(int chars = 1; chars<=line ; chars++){
                System.err.print(ch);
                ch++;
            }
            System.err.println();
        }
    }
}
