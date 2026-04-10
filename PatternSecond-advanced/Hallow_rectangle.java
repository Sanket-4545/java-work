public class Hallow_rectangle {
public static void hallowRectangle(int totRow, int totcol) {
    for(int i=1; i<=totRow; i++){
     for(int j = 1; j<=totcol ; j++){
if (i == 1||i == totRow||j == 1||j== totcol) {
    System.out.print("*");
  
}
 else{
     System.out.print(" ");
   }

     }
     System.out.println("");

    }
}
    public static void main(String[] args) {
       hallowRectangle(15, 8); 
    }
}