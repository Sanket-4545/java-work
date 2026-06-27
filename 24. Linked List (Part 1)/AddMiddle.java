public class AddMiddle {
   
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void AddMiddle(int idx, int data){
        Node newNode = new Node(data);

        if (head == null || idx == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node temp = head;
        int i = 0;
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        if (temp == null) {
            tail.next = newNode;
            tail = newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        if (temp == tail) {
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        AddMiddle ll = new AddMiddle();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.AddMiddle(1,8);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}


