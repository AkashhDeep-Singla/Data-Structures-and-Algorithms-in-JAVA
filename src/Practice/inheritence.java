package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int roll;
    String name;
    Student(int r, String n) {
        this.roll = r;
        this.name = n;
    }
    public String toString() {
        return roll+" "+name;
    }
}

class MyComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if(s1.name == s2.name) {
            return 0;
        } else if (s1.name.compareTo(s2.name) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class inheritence {
    public static void main(String[] args) {
        ArrayList<Student> ts = new ArrayList<Student>();
        ts.add(new Student(45, "Naval"));
        ts.add(new Student(21, "Sahil"));
        ts.add(new Student(45, "Balla"));

        Collections.sort(ts, new MyComparator());
        System.out.println(ts);
    }
}
