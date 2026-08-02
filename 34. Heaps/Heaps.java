import java.util.*;
public class Heaps {
static class Heap {
ArrayList<Integer> arr = new ArrayList<>();

public void add (int data){
    arr.add(data);

    int x = arr.size()-1;
    int par = (x-1)/2;     //Rearrange

    while (arr.get(x)<arr.get(par)) {
        int temp = arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par, temp);
    }
}
public int peek(){
    return arr.get(0);  // peek from heap
}
    
}
 public static void main(String[] args) {
 
  }
 }   

