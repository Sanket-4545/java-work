import java.util.PriorityQueue;

public class pqOfObject {
    static class Student implements Comparable<Student> {
        String Name;
        int Rank;

        public Student(String name, int rank) {
            this.Name = name;
            this.Rank = rank;
        }

        @Override
        public int compareTo(Student S2) {
            return this.Rank - S2.Rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 3));
        pq.add(new Student("B", 1));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 4));
        pq.add(new Student("E", 5));

        while (!pq.isEmpty()) {
            Student s = pq.poll();
            System.out.println(s.Name + " " + s.Rank);
        }
    }
}
