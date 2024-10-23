package Notes.Heaps;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = {12,11,13,5,6,7};
        int size = arr.length;
        Heap heap = new Heap();
        heap.heapSort(arr, size);
        heap.printArray(arr, size);

        GenericHeap<Integer> genHeap = new GenericHeap<>();
        genHeap.insert(10);
        genHeap.insert(2);
        genHeap.insert(23);
        genHeap.insert(4);
        genHeap.insert(8);
        System.out.println(genHeap.heapSort());
    }
}
