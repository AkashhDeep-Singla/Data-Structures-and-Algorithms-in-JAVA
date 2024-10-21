package Notes;

import java.util.ArrayList;

public class HashDemo {
    private final int BUCKET_SIZE;
    private final ArrayList<Integer>[] table;

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

    void delete(int key)
    {
        int index = hashFunction(key);
        if(table[index].contains(key))
        {
            table[index].remove(Integer.valueOf(key));
        }
        else{
            System.out.println("Key not found");
        }
    }
    void PrintHash()
    {
        for(int i=0 ; i<BUCKET_SIZE ; i++){
            System.out.print(i);
            for(int x : table[i]){
                System.out.print(" --> " + x);
            }
            System.out.println();
        }
    }

    int hashFunction(int key) {
        return key % BUCKET_SIZE;
    }

    public static void main(String[] args) {
        int[] arr = {12, 65, 86, 24, 9, 73, 58};
        HashDemo h = new HashDemo(arr.length);
        for (int j : arr) {
            h.insert(j);
        }
        h.delete(9);
        h.PrintHash();
    }
}
