public class FunctionArguments {
    public static void updateMarks(int marks[]){
        for (int i= 0; i<marks.length; i++){
            marks[i] = marks[i]+2;
            System.out.println(marks[i]);
        }
    } {
        
    }
 public static void main(String[] args) {
    int marks[] = {90, 80, 70};
   for (int i= 0; i<marks.length; i++){
    System.out.println("mark before updating: " + marks[i]);
    
   }
  
   updateMarks(marks);
 }   
}
