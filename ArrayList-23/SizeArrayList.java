import java.util.ArrayList;

public class SizeArrayList {
    public static void main(String[] args) {
       ArrayList<Integer>element = new ArrayList<>();
       element.add(1);
       element.add(2); 
       element.add(3);
       element.add(4);
       element.add(5);
System.out.println("Size of the element is = " + element.size());

// Print elements in reverse order
for (int i = element.size() - 1; i >= 0; i--) {
    System.out.print(element.get(i) + " ");
}
    }
}
