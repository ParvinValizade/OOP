package inheritance.pack1;

public class Main {
    public static void main(String[] args) {
        Lion lion = (Lion) new Animal(); //downCasting
        Animal animal = new Lion();//upCasting
    }
}
