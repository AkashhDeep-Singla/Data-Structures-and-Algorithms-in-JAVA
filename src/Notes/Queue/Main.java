package Notes.Queue;

public class Main {
    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(27);
        queue.insert(51);
        queue.insert(43);
        queue.insert(89);
        queue.insert(16);

        queue.display();
    }
}
