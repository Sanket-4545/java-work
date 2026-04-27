public class Concatenation_and_charAt {
    public static void Printlatter(String str) {
        for ( int i = 0 ; i < str.length(); i++){
            System.out.print(str.charAt(i) +" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String firstName = "Sanket";
        String middleNmae = "Dadasaheb";
        String lastName = "Bhojane";
        String fullName = firstName + " " + middleNmae + " " +lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));
        Printlatter(fullName);
    }
}
