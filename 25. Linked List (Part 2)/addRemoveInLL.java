public class addRemoveInLL {
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node (int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addLast(int data){
        Node newNode = new Node(data);
        size ++;
        if(head == null){
            head = tail = newNode;
    return;
        }
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;

    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main (String [] args){
        addRemoveInLL add= new addRemoveInLL();
        add.addLast(1);
        add.addLast(2);
        add.addLast(3);
        
        add.print();
    }
}
