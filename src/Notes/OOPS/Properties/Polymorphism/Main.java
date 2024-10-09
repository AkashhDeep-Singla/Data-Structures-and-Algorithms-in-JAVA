package Notes.OOPS.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes(); // obj. type decides which method to run not ref. var.
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Shapes circle2 = new Circle(); // upcasting -> which method is to be called depends on Son.

        shape.area();
        circle.area();
        square.area();
        triangle.area();
        circle2.area();
    }
}
