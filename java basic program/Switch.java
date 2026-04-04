import java.util.Scanner;

public class Switch {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of numebr");
    int number = sc.nextInt();
    switch (number) {
        case 1:System.out.println("one ");
         break;
        case 2:System.out.println("twe");
         break;
        case 3:System.out.println("3 ");
         break;
    
        default:System.out.println("sorry");
            break;
    }
   } 
}
