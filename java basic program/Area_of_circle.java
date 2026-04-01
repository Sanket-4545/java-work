import java.util.*;

public class Area_of_circle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the value of the radius of the circle:");
        float radius = sc.nextFloat();
         float area = (3.14f * radius * radius);
         System.out.println("The Area of the circle is :" +area);
    }
}