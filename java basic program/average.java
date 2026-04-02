import java.util.*;

public class average  {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the value of a,b and c :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float D = (a+b+c)/3;
        System.out.println("The average of three number is :" +D);

    }
    
}
