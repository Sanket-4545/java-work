public class Upper_and_lowerCase {
    public static void upperCase(String about) {
         String upperCaseName = about.toUpperCase();
        System.out.println(upperCaseName);
    }
    
    public static void lowerCase(String about) {
         String lowerCaseName = about.toLowerCase();
        System.out.println(lowerCaseName);
    }

    public static void main(String[] args) {
        String about = "Sanket IS A Good Boy";
        upperCase(about);
        lowerCase(about);
    }
}
