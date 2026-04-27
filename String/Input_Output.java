import java .util.*;

public class Input_Output {

    public static void main(String[] args) {
      Scanner Sc = new Scanner(System.in);
      String name;
      // if you write one sentence because of next() that print only first words
      name = Sc.next();
      System.out.println(name);
      
      Scanner Add = new Scanner(System.in);
      String Address;
      // if you write one sentence because of nextline() that print full line
      Address = Add.nextLine();  
      System.out.println(Address);



        
    }
}