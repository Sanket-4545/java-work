
public class Inheritance {

    public static void main(String[] args) {
        bus b = new bus();
        b.color = "yellow";
        b.milege();
        b.hp();
        b.capacity();
    }
}

class vehical {
    String color;

    void milege() {
        System.out.println("milage ");
    }

    void hp() {
        System.out.println("Horse Power");
    }
}

class bike extends vehical {
    int speed;
}

class bus extends bike {
    void capacity() {
        System.out.println("Capacity  carry the passenger");
    }
}