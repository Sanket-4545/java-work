import java.util.Deque;
import java.util.LinkedList;

public class deque {
   public static void main(String[] args) {
    Deque<Integer> d = new LinkedList<>();
     
    d.addFirst(1);
    d.addFirst(2);
    d.addFirst(3);
 System.out.println(d);

    d.removeFirst();
    d.removeLast();
    System.out.println(d);
    d.addLast(4);
    d.addLast(5);
    System.out.println(d);

    System.out.println("First element is :" + d.getFirst());
    System.out.println("Last element is :" + d.getLast());
    System.out.println("Size:" + d.size());
   } 
}
