public class compress {
public static String Compress(String str) {
        String newString = "" ; 
    for ( int i = 0 ; i<str.length();i++){
int count = 1;
while (i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)) {
    count++;
    i++;
}
newString += str.charAt(i);
newString += count;
    }
    return newString;
}


    public static void main(String[] args) {
        String str = "aaabbbccddd";
        System.out.println(Compress(str));
    }
}