import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        //Create
        HashMap<String,Integer> hm = new HashMap<>(); 
        //Insert value let consider student name and it's mark;
        hm.put("Sanket", 15);
        hm.put("Pravin", 19);
        hm.put("Ram", 13);
        hm.put("Hari", 20);

        System.out.println(hm);
        int mark = hm.get("Sanket");
        System.out.println("Mark of Sanket is: " + mark);
        //If key not belong to the given the it show null value
        System.out.println("Mark of Ramesh is: " + hm.get("Ramesh"));

        //ContainKey ==>it show only true or false
        System.out.println("Is Sanket is present in the HashMap: " + hm.containsKey("Sanket"));

        System.out.println(hm.remove("Hari"));
        System.out.println(hm);
        System.out.println("size of the hashMap" +hm.size());
        //If we want to clear the HashMap
        hm.clear();
        //Check whether the HashMap is empty
        System.out.println("Check whether HashMap is empty or Not:"+hm.isEmpty());
    }
    
}