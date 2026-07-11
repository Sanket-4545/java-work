import java.util.LinkedList;
import java.util.List;

public class CommonAncestor {

    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean getPath(Node root, int n, List<Node> path) {
        if (root == null) {
            return false;
        }

        path.add(root);
        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }

        path.remove(path.size() - 1);
        return false;
    }

    public static Node LCA(Node root, int n1, int n2) {
        List<Node> path1 = new LinkedList<>();
        List<Node> path2 = new LinkedList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i;
        for (i = 0; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }

        return path1.get(i - 1);
    }

    public static void main(String[] args) {
        //         1
        //        / \
        //      2    3
        //     / \  / \
        //    4  5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 5;
        Node lca = LCA(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + lca.data);
    }
}
 