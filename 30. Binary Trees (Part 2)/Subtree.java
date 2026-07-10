// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class Subtree {

   static class Node {
      int data;
      Node left;
      Node right;

      public Node(int var1) {
         this.data = var1;
         this.left = null;
         this.right = null;
      }
   
public static boolean isIdentical(Node node, Node subRoot){
if(node == null && subRoot == null){
   return true;
}
   else if (node == null || subRoot == null || node.data != subRoot.data) {
return false;      
   }
   if(!isIdentical(node.left, subRoot.left)){
      return false;
   }
   if (!isIdentical(node.right, subRoot.right)) {
      return false;
   }

   return true;
}

      public static boolean isSubTree(Node root, Node subRoot){
         if(root == null){
            return false;
         }
       if(root.data == subRoot.data) {
          if(isIdentical(root, subRoot)){
            return true;

         }
      }
      
      return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
      }
   }
      public static void main(String[] var0) {
      Node var1 = new Node(1);
      var1.left = new Node(2);
      var1.right = new Node(3);
      var1.left.left = new Node(4);
      var1.left.right = new Node(5);
      var1.right.left = new Node(6);
      var1.right.right = new Node(7);


    Node subRoot = new Node(2);
    subRoot.left = new Node(4);
    subRoot.right = new Node(5);

    System.out.println(Node.isSubTree(var1, subRoot));
   }

}

