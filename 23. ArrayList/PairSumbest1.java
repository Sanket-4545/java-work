import java.util.ArrayList;
public class PairSumbest1 {
    public static boolean PairSum1(ArrayList<Integer> list, int target){
        int lb = 0;
        int rb = list.size()-1;

        while (lb != rb) {
            int sum = list.get(lb) + list.get(rb);
            if (sum == target) {
                return true;    
            }
            if (sum > target) {
                rb--;
            }
            else{
                lb++;
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(13);
        list.add(17);

        int target = 20;
        System.out.println(PairSum1(list, target));
        
    }
}
