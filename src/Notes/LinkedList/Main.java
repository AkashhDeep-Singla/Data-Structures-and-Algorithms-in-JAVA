package Notes.LinkedList;

public class Main {
    public static void main(String[] args) {
        CustomLink list = new CustomLink();

        list.insertFirst(7);
        list.insertFirst(5);
        list.insertLast(34);
        list.insertLast(12);
        list.insertAt(63, 2);

        list.display();

        DoubleLink dList = new DoubleLink();

        dList.insertFirst(5);
        dList.insertFirst(21);
        dList.insertLast(13);
        dList.insertLast(47);
        dList.insertAfter(98, 21);
        dList.display();
        dList.displayRev();
    }
}
