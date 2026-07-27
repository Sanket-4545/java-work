import java.util.PriorityQueue;

public class NearstPath {

    static class Point implements Comparable<Point> {
        int x, y;
        int distSqr;

        public Point(int x, int y, int distSqr) {
            this.x = x;
            this.y = y;
            this.distSqr = distSqr;
        }

        @Override
        public int compareTo(Point p2) {
            return this.distSqr - p2.distSqr;
        }
    }

    public static void main(String[] args) {

        int ptr[][] = {{3, 3}, {5, -1}, {-2, 4}};

        PriorityQueue<Point> pq = new PriorityQueue<>();

        for (int i = 0; i < ptr.length; i++) {
            int x = ptr[i][0];
            int y = ptr[i][1];

            pq.add(new Point(x, y, x * x + y * y));
        }

        Point nearest = pq.peek();

        System.out.println("Nearest Point to Origin:");
        System.out.println("(" + nearest.x + ", " + nearest.y + ")");
        System.out.println("Distance Squared: " + nearest.distSqr);
    }
}