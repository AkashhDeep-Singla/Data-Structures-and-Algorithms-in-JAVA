package Notes;

public class Classes {
    public static void main(String[] args) {
        Student Akash = new Student(1215, "Akashdeep Singla", 91.8f);
        Student XYZ = new Student();
        Akash.changeName("Sky Singla");
        Akash.greeting();

        System.out.println(Akash.name);
        System.out.println(XYZ.name);

        Student one = new Student(1, "firstStd", 100.00f);
        Student two = one;
        System.out.println(two.name); // points to same object so -> firstStd


        // WRAPPER CLASS
        int a = 10; // primitive data
        int b = 20;
        swap(a, b);
        System.out.println(a+" "+b);

        Integer num1 = 25; // object
        Integer num2 = 50;
        newSwap(num1, num2);
        System.out.println(num1+" "+num2); // in this case also it won't change due to 'final' keyword

        final int BONUS = 2;
        // can't do BONUS = 3 or something due to final
        // final variable has to be initialised while declaring it as it can't be changed later
        // this is done to prevent from storing garbage value in it for all time
        // this all is only true for primitive data types
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    static void newSwap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class Student {
    int roll;
    String name;
    float marks;

    Student() {               // called in case of no params
//        this.roll = 99999;
//        this.name = "Unknown";
//        this.marks = 33.3f;
        this(99999, "Unknown", 33.33f);   // calling another constructor inside a constructor
    }
    // above and below case is called function/constructor overloading.

    Student(int roll, String name, float marks) {        //called in case of 3 params
        this .roll = roll;
        this.name = name;
        this.marks = marks; // 'this' is replaced with the name of the reference variable, or we can say its reference is passed.
                            // not using 'this' in this case causes error as var names are same.
    }

    void changeName(String newName) {
        this.name = newName;
    }

    void greeting() {
        System.out.println("Good Morning ! "+ this.name); // here we can use only name also
                                                          // as java automatically takes the reference of current object
                                                          // but it is a good practice to use this keyword
                                                          // as it may cause errors in some cases.
    }
}
