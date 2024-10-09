package Notes.abstractDemo;

public class Daughter extends Parent {
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner(int age) {
        System.out.println("I love ABC and he is " + age);
    }
}
