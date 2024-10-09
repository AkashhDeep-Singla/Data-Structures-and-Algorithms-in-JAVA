package Notes.Packages.Main;

import Notes.Packages.Imports.Human;

public class Main {
    public static void main(String[] args) {
        Human Akash = new Human(21, "Akashdeep Singla", false);
        Human Acharya = new Human(22, "Akhil Acharya", false);

        System.out.println(Akash.population);     // 2
        System.out.println(Acharya.population);   // 2
        System.out.println(Human.population);     // 2

        //greeting()
        //this does not belongs to an object
        // this requires an instance but the function we are using it in does not depend on instances

        Main obj = new Main();
        obj.greeting();  /* now we can access non-static stuff here because an object of 'Main' class has been created,
                          so now it has an instance to be referenced. */
    }

    // something which is non-static belongs to an object
    public void greeting() {
        System.out.println("Hi! Good Morning");
        fun(); // We can access static stuff indside non-static class/method
    }

    public static int fun() {
        return 0;
    }
}
