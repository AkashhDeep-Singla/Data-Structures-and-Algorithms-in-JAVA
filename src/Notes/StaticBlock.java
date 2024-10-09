package Notes;

public class StaticBlock {
    static int a = 4;
    static int b;

    // runs only once when first object is created
    static {
        System.out.println("Inside static block");
        b = a * 4;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
