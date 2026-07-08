/**
 * heightOfArray
 */
public class Tree
 {

    static class Node {
    int data;
    Node left, right;
    
     public Node(int data){
        this.data = data;
     this.left = null;
     this.right = null;
        
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int myHeight = Math.max(leftHeight, rightHeight) + 1;
        return myHeight;
    }
    public static int count(Node root){
        if (root== null) {
            return 0;
        }
        int leftCount = count(root.left);
        int rightCount = count(root.right);
        // Count the current node plus all left and right subtrees
        return leftCount + rightCount +1;
    }
}
public static void main(String[] args) {


        //         1
        //        / \
        //      2    3
        //     / \  / \
        //    4  5 6   7

        Node  root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left =new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7); 

   
        // System.out.println("Height of the tree is: " + Node.height(root));
        System.out.println("Node count in the tree is : "+ Node.count(root));

}
}