import java.util.*;
public class StoredWater {
    public int storedWater(ArrayList<Integer> height) {
        int maxWater = 0;
        //brute force
        for(int i = 0 ; i<height.size(); i++){
            for (int j = i+1; j<height.size(); j++){
                int ht = Math.min(height.get(i), height.get(j) );
                int wt = j - i;
                int currentWater = ht * wt;
                maxWater = Math.max(maxWater, currentWater);
            }
        }
    return maxWater;
}

    public static void main(String[] args) {
        ArrayList<Integer>height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
    
        StoredWater obj = new StoredWater();
        int result = obj.storedWater(height);
        System.out.println(result);
    }

}

