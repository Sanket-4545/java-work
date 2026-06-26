import java.util.ArrayList;

public class PairSumbest2 {

    public static boolean pairsum2(ArrayList<Integer> list, int target) {

        int n = list.size();

        // Find breaking point
        int bp = 0;
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        int lb = bp + 1; // smallest element
        int rb = bp;     // largest element

        while (lb != rb) {

            int sum = list.get(lb) + list.get(rb);

            if (sum == target) {
                return true;
            }

            if (sum < target) {
                lb = (lb + 1) % n;
            } else {
                rb = (n + rb - 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(13);
        list.add(17);
        list.add(5);
        list.add(7);
        list.add(9);

        int target = 20;

        System.out.println(pairsum2(list, target));
    }
}