public class compare {
    public static void main(String[] args) {
        String s1 = "Sanket";
        String s2 = "Sanket";
        String s3 = new String("Sanket");

        if(s1 == s2){
            System.out.println("Srting s1 and s2 are same");
        }
        else{
             System.out.println("Srting s1 and s2 are not same");
        }
        
        if(s2 == s3){
            System.out.println("Srting s1 and s2 are same");
        }
        else{
             System.out.println("Srting s2 and s3 are not same");
        }
        if (s3.equals(s2)) {
            System.out.println("Srting s3 and s2 are same");
        }
        else{
            System.out.println("Srting s1 and s2 are not same");
        }

    }
}
