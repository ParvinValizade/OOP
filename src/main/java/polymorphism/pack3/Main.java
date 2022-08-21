package polymorphism.pack3;

public class Main {
    public static void main(String...args) {
        Figure triangle = new Triangle();
        triangle.draw();

        Figure square = new Square();
        square.draw();

        Triangle t = new Triangle();
        t.draw();
    }
}
