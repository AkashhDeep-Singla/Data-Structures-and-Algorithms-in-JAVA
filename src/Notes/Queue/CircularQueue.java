package Notes.Queue;

public class CircularQueue {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int end = -0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length-1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[++end] = item;
        end %= data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front %= data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("END");
    }
}
