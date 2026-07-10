// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Queue;

public class topView {

   static class Node {
      int data;
      Node left;
      Node right;

      public Node(int var1) {
         this.data = var1;
         this.left = null;
         this.right = null;
      }
      static int minHD = 0;
      static int maxHD = 0;
      static class Info{
         Node node;
         int hd;

         public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
         }
      }
      public static HashMap<Integer,Node> topView(Node root){
         HashMap<Integer,Node> map = new HashMap<>();
         if(root == null){
            return map;
         }

         Queue<Info> q = new ArrayDeque<>();
         q.offer(new Info(root, 0));
         minHD = 0;
         maxHD = 0;

         while(!q.isEmpty()){
            Info curr = q.poll();
            if(!map.containsKey(curr.hd)){
               map.put(curr.hd, curr.node);
            }
            if(curr.node.left != null){
               q.offer(new Info(curr.node.left, curr.hd-1));
               minHD = Math.min(minHD, curr.hd-1);
            }
            if(curr.node.right != null){
               q.offer(new Info(curr.node.right, curr.hd+1));
               maxHD = Math.max(maxHD, curr.hd+1);
            }
         }
         return map;
      }
   
      public static void main(String[] var0) {
      Node var1 = new Node(1);
      var1.left = new Node(2);
      var1.right = new Node(3);
      var1.left.left = new Node(4);
      var1.left.right = new Node(5);
      var1.right.left = new Node(6);
      var1.right.right = new Node(7);

      HashMap<Integer, Node> map = topView(var1);
      for(int var2 = minHD; var2 <= maxHD; ++var2) {
         Node n = map.get(var2);
         if(n != null) {
            System.out.print(n.data + " ");
         }
      }
   // System.out.println();
   }

   }
}   

