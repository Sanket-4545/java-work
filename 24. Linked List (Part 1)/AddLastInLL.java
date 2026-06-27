public class AddLastInLL {
    public static class Node{
        int data; 
        Node next;
public Node (int data){
    this.data = data ;
    this.next = null;
}
    }
    public static Node head;
    public static Node tail;

    public void addLast(int data){
        if(head == null){
            head = tail = new Node(data);
            return;
        }
        tail.next = new Node(data);
        tail = new Node(data);
    }
    public static void main(String[] args){
        AddLastInLL ll = new AddLastInLL();
        ll.addLast(1);
        ll.addLast(2);      

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}