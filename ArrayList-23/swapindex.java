import java.util.ArrayList;
public class swapindex {

    public static void swip(ArrayList<Integer> element, int index1, int index2 ) {
      int  temp = element.get(index1);
        element.set(index1, element.get(index2)) ;
    element.set(index2, temp);
    }

    public static void main(String[] args) {
       ArrayList<Integer>element = new ArrayList<>();
       element.add(3);
       element.add(4);
       element.add(5);
       element.add(6);
       element.add(7);

       int index1 = 1;
        int index2 = 3;
        
        System.out.println(element);
       swip(element, index1, index2);
       
        System.out.println(element);
       
    }
}
