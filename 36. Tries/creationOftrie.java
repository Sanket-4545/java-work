
public class creationOftrie {
   static class Node{
        Node Children[] = new Node[28];
        Boolean eow = false;

        Node(){
            for (int i = 0; i< 26 ; i++){
                Children[i] = null;
            }

        }
        public static Node root = new Node();
    }
public static void main(String[] args) {
    String words[] = { "the", "a", "there","their","any","any","three"};
}
    
}