import java.util.HashMap;
import java.util.LinkedHashMap;

public class linkHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("Sanket", 45);
        lhm.put("Dhanrak", 33);
        lhm.put("Tejas", 18);
        System.out.println(lhm);// So it will print the value in the order of insertion

       HashMap<String,Integer> hm = new HashMap<>();
       hm.put("Sanket", 45);
       hm.put("Dhanrak", 33);
       hm.put("Tejas", 18);
       System.out.println(hm); //so it will print the value in random order because HashMap does not maintain the order of insertion

    }
}
