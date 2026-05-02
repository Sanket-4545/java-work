public class Interface {

    public static void main(String[] args) {
     Queen q = new Queen();
     q.move();   
    }
}

interface ChessPlayer {
    // hear move is a abstraction so in interface abstraction must present
    void move();
}

class Queen implements ChessPlayer {
  public  void move() {
System.out.println("move in all direction");
    }
}

class king {
   public void move() {
       System.err.println("One step in any direction ");
    }
}