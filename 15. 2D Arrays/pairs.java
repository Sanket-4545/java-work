// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
public class pairs {
   public pairs() {
   }

   public static void printPairs(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         int var2 = var0[var1];

         for(int var3 = var1 + 1; var3 < var0.length; ++var3) {
            System.out.println("(" + var2 + "," + var0[var3] + ")");
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{2, 4, 6, 8, 10};
      printPairs(var1);
   }
}
