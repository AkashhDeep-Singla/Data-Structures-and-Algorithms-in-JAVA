package Practice;

import java.util.ArrayList;

public class HashDemo {
    private final int BUCKET_SIZE;
    private final ArrayList<Integer> table[];

    public HashDemo(int size) {
        this.BUCKET_SIZE = size;
        this.table = new ArrayList[size];
        for(int i=0; i<size; i++) {
            table[i] = new ArrayList<>();
        }
    }

    void insert(int key) {
        int index = hashFunction(key);
        table[index].add(key);
    }

    void delete(int key) {
        int index = hashFunction(key);
    }

    int hashFunction(int key) {
        return key % BUCKET_SIZE;
    }

    public static void main(String[] args) {
        int[] arr = {12, 65, 86, 24, 9};
        HashDemo h = new HashDemo(arr.length);
        for(int i=0; i<arr.length; i++) {
            h.insert(arr[i]);
        }
        delete(9);
    }
}
