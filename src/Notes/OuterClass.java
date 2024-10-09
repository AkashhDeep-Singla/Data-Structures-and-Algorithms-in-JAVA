package Notes;

public class OuterClass { // outer classes cant be static as they aren't dependent on any other class
    public static class InnerClass{ /* inner classes need to be static to access elsewhere i.e. static
                                     as they aren't dependent on any other class */
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass in = new InnerClass("Akash");
    }
}
