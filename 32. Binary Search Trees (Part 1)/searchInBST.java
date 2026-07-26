 
public class searchInBST {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    // Insert a node into BST
    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    // Search for a key in BST
    public static boolean Search(Node root, int key) {

        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return Search(root.left, key);
        } else {
            return Search(root.right, key);
        }
    }

    public static void main(String[] args) {

        int value[] = {5, 1, 3, 4, 2, 7};

        Node root = null;

        // Create BST
        for (int i = 0; i < value.length; i++) {
            root = insert(root, value[i]);
        }

        if (Search(root, 3)) {
            System.out.println("The key element is found");
        } else {
            System.out.println("Key element is not found");
        }
    }
}