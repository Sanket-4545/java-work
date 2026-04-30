public class ith_bit {
    public static int GetIthBit(int n , int i) {
       int bitmaks = 1<<i;
      if ((n & bitmaks) == 0) {
            return 0;
        }
        else return 1;
    }


public static int SetithBit(int n , int i) {
    int bitMask = 1<<i;
   return n |bitMask ;
}


public static int ClearithBit(int n , int i) {
    int bitMask = ~(1<<i);
   return n & bitMask;
}

public static int updateBit(int i,int n ,int newBitMask){
    if (newBitMask == 0) {
        return  ClearithBit(n, i);
    }
    else{
        return SetithBit(n, i);
    }
    
}

    public static void main(String[] args) {
    // System.out.println ( GetIthBit(10, 3) ) ;
    // System.out.println(SetithBit(10, 2));
    System.out.println(ClearithBit(10, 1));

    }
}
