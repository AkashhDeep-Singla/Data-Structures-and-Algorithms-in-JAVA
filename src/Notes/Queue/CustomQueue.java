package Notes.Queue;

public class CustomQueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = -1;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return end == data.length-1;
    }

    public boolean isEmpty() {
        return end == -1;
    }

    public boolean insert(int item) {
        if(isFull()) {
            return false;
        }
        data[++end] = item;
        return true;
    }

    public int remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[0];
        for(int i=1; i<data.length ; i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if(isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println("END");
    }
}
