package Notes.OOPS.Properties.Inheritance;

public class Box {
    double l;
    double b;
    double h;

    public Box() {
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    public Box(double side) {
        this.l = side;
        this.b = side;
        this.h = side;
    }

    public Box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    public Box(Box oldBox) {
        this.l = oldBox.l;
        this.b = oldBox.b;
        this.h = oldBox.h;
    }
}
