import java.util.*;
public class ColletionSort {
   public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
list.add(33);
list.add(45);
list.add(54);
list.add(78);
list.add(13);

System.out.println(list);  //simple list
Collections.sort(list); //Sorted list acending order
System.out.println(list);
Collections.sort(list,Collections.reverseOrder());
System.out.println(list); //Sorted list decending order
   }
  

    
}
