package Algorithms.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 0, 2, 5, 7};
        int target = 5;
        int ans = linearSearch(arr, 6, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int n, int key){
        int pos = -1;
        for(int i=0 ; i<n ; i++){
            if (arr[i]==key){
                pos = i;
                break;
            }
        }
        return pos;
    }

}
