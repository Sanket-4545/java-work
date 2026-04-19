import java.util.Scanner;

public class function {

    // function number one that is print Hallow world many time after calling the function
    public static void hallowWords() {
        System.out.println("Hallow World");
        System.out.println("Hallow World");
        System.out.println("Hallow World");
        System.out.println("Hallow World");
        System.out.println("Hallow World");
        
    }
    // this is another function in that calculate the sum of a and b.
    public static int CalculateSum(int a, int b ) {
       int sum = a + b;
       return sum ;
        
    }

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        int a = sc.nextInt();
         System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        int sum = CalculateSum(a, b);
         System.out.println("The sum of two number is :" +sum);
       hallowWords(); 
       CalculateSum(a,b);
    }
}