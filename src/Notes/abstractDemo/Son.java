package Notes.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to be a Web Developer");
    }

    @Override
    void partner(int age) {
        System.out.println("I love XYZ and she is " + age);
    }
}
