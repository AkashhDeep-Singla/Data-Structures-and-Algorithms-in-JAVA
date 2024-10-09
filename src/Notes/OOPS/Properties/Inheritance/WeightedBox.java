package Notes.OOPS.Properties.Inheritance;

public class WeightedBox extends Box{
    double w;

    public WeightedBox() {
        this.w = -1;
    }

    public WeightedBox(double side, double w) {
        super(side); // call the parent class constructor
        this.w = w;
        // we can't call super in this line i.e. after child member's initialisation
        // as parent object needs to be created first and not the child object because child needs to access parent object first
    }

    public WeightedBox(double l, double b, double h, double w) {
        super(l, b, h);
        this.w = w;
    }

    public WeightedBox(WeightedBox oldBox) {
        super(oldBox);
        this.w = oldBox.w;
    }
}
