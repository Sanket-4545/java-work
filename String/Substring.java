public class  {
    public static String Substring(String str, int si, int ei) {
        String subString = "";
        for (int i = si ; i< ei ; i++){
            subString += str.charAt(i);
        }


     return subString;   
    }
    public static void main(String[] args) {
        String str = "Sanket Bhojane";
        // int str let space between the two words that it read of count space also
        System.out.println(Substring(str, 0, 9));
    }
}
