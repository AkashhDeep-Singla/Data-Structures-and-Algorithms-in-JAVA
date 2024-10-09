package Notes.OOPS.Properties.Polymorphism;

public class Circle extends Shapes {
    @Override // this is called annotation
    public void area() {
        System.out.println("Area is PI*(r^2)");
    }
    // this will run when object of circle is created and will override the 'area' method of 'Shapes'(Parent) class.
}
