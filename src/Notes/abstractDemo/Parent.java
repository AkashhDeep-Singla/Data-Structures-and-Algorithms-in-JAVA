package Notes.abstractDemo;

public abstract class Parent {
    int age;

    Parent(int age) {
        this.age = age;               // this is of no use as we can't create objects of abstract classes
                                      // although it can be used to define constructor of child classes
    }

    abstract void career();
    abstract void partner(int age);

    static void hello() {
        System.out.println("Hi!");
    }
}
