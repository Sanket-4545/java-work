import java.util.PriorityQueue;
public class introPQ {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(5);
        pq.add(4);
        pq.add(8);
        pq.add(7);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }
        
    }
}