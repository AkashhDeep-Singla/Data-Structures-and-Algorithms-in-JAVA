package Notes.Heaps;

// here we use the example of max heap
public class Heap {
    void heapSort(int[] arr, int size){
        for (int i = size/2-1; i>=0 ; i--)
            heapify(arr, size, i);

        for (int i = size-1; i>=0; i--){
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, i, 0);
        }
    }

    void heapify(int[] arr, int size, int itr){
        int largest = itr;
        int left = 2* itr +1;
        int right = 2* itr +2;

        if (left < size && arr[left] > arr[largest])
            largest = left;

        if (right < size && arr[right] > arr[largest])
            largest = right;

        if (largest != itr){
            int temp = arr[itr];
            arr[itr] = arr[largest];
            arr[largest] = temp;

            heapify(arr, size, largest);
        }
    }

    void printArray(int[] arr, int size){
        for (int i=0; i<size; i++){
            System.out.println(arr[i]);
        }
    }
}
