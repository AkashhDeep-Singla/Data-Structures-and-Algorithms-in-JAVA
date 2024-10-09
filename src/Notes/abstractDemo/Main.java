package Notes.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(27);
        son.career();
        son.partner(26);

        Daughter daughter = new Daughter(24);
        daughter.career();
        daughter.partner(25);

        Parent.hello();  // can call static methods of abstract class;
    }
}
