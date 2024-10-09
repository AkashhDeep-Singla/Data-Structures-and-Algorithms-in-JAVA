package Notes.Packages.Imports;

public class Human {
    public int age;
    public String name;
    public Boolean married;
    public static long population;

    public Human(int age, String name, Boolean married) {
        this.age = age;
        this.name = name;
        this.married = married;

        Human.population += 1;
    }
}
