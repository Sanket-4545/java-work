public class binTOdec {
   
   public static void BinTODec(int binNum) {
    int pow = 0;
    int decNum = 0;
    int myNum = binNum;
    while (binNum > 0) {
        int lastNum = binNum % 10;
        decNum = decNum + (lastNum * (int) Math.pow(2, pow));
        pow ++;
        binNum = binNum / 10;
    }
    System.out.println("decimal of " +myNum+ "=" +decNum);  
    
   } 
    public static void main(String[] args) {
      BinTODec(10010);
    }
}
