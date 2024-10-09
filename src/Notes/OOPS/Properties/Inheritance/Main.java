package Notes.OOPS.Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        WeightedBox box = new WeightedBox(5, 4, 2, 15);
        WeightedBox box2 = new WeightedBox(box);

        System.out.println(box2.l+" "+box2.b+" "+box2.h+" "+box2.w);

        Box box3 = new WeightedBox(2, 4, 5, 12);
//        System.out.println(box3.w);       // we still can't access 'w' here as it is the type of ref. var.
                                            // not the object that determines what members can be accessed.

//        WeightedBox box4 = new Box(1,2,3);
        /*
        there are many variables in both child and parent class
        we are given access to members that are in ref. var. i.e. WeightedBox
        so we have access to weight, but we are creating object of Parent class i.e. Box so only its constructors can be called
        which does not access to weight variable (parent cant access child members) but all members that we have access to
        should be initiated
        and weight can't be initiated in Box constructor so it gives error
        */
    }
}
