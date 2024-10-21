package Algorithms.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort (int[] a) {
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++){
            for (j = i + 1; j < n; j++){
                if (a[j] < a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
