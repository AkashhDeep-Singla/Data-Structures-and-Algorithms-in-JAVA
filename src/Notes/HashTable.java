package Notes;

import java.util.ArrayList;

public class HashTable {
    private final int bucket_size;
    private final ArrayList<Integer>[] table;

    HashTable(int bucket){
        this.bucket_size = bucket;
        this.table = new ArrayList[bucket_size];

        for (int i=0; i<bucket_size; i++) {
            table[i] = new ArrayList<>();
        }
    }

    int hashFunction(int key){
        return (key % bucket_size);
    }

    void insert(int key){
        int index = hashFunction(key);

        table[index].add(key);
    }

    void delete(int key){
        int index = hashFunction(key);

        if (table[index].contains(key))
            table[index].remove(Integer.valueOf(key));
        else
            System.out.println("Key not found");
    }

    void print_Hash(){
        for (int i=0 ; i<bucket_size ; i++){
            System.out.print(i);
            for (int j : table[i]){
                System.out.print(" --> "+j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int[] arr = {12,65,94,26,87,24};
        HashTable ht = new HashTable(arr.length);

        for (int j : arr) {
            ht.insert(j);
        }

        ht.delete(94);
        ht.print_Hash();
    }

}
