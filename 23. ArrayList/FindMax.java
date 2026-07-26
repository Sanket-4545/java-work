import java.util.ArrayList;

public class FindMax {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(4);
        list.add(34);
        list.add(45);
        list.add(23);
    int max = Integer.MIN_VALUE;
    for(int i = 0 ; i<list.size();i++){
        if (max < list.get(i)) {
            max = list.get(i);
        }
    }
    System.out.println("Max number is = " + max);
    }
}
