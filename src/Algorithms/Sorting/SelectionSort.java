package Algorithms.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 1, 9};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        int i, j, small;
        int n = arr.length;
        for (i=0 ; i<n ; i++){
            small=i;
            for (j=i+1 ; j<n ; j++){
                if (arr[j] < arr[small]){
                    small=j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

}
