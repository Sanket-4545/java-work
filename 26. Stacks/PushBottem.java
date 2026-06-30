import java.util.*;
public class PushBottem {
    public static void pushAtBottem(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottem(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

      pushAtBottem(s, 4);
      while (!s.empty()) {
        System.out.println(s.pop());
      }


    }
}
