import java.util.ArrayList;
public class ArrayListSyntax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String>  list1 = new ArrayList<>();
        // ArrayList<Boolean> list2 = new ArrayList<>();

        // Add the element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
       System.out.println(list);
       
       //Get element (give the value of on the index)
       list.get(4);

       //Remove element
       list.remove(5);
       System.out.println(list);

    //    //Set the element at the index
       list.set(4,45);
       System.out.println(list);

    //    //chack elemtnt is avable in ArrayList

       System.out.println(list.contains(45));
       System.out.println(list.contains(100));
    }
}
