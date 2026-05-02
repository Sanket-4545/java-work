public class Overriding {
    public static void main(String[] args) {
        Deer deer = new Deer();
        deer.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
System.out.println("Eat grass");
    }
}
