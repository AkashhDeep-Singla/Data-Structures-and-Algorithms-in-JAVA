package Notes.OOPS.Properties.Inheritance;

public class RetailBox extends WeightedBox{
    double price;

    public RetailBox() {
        super();
        this.price = -1;
    }

    public RetailBox(double l, double b, double h, double w, double price) {
        super(l, b, h, w);
        this.price = price;
    }

    public RetailBox(WeightedBox oldBox, double price) {
        super(oldBox);
        this.price = price;
    }
}
