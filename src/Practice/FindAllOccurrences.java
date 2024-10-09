package Practice;

import java.util.ArrayList;

public class FindAllOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 8, 2, 7, 1, 0, 5, 2, 1};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(indexesAt(arr, 2, 0, list));
        System.out.println(occurrenceAt(arr, 1, 0));
    }

    static ArrayList<Integer> indexesAt(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        return indexesAt(arr, target, index+1, list);
    }
    // we can modify this to reduce one argument i.e. ArrayList so that user does not have to create an Arraylist himself.

    static ArrayList<Integer> occurrenceAt(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> occurrenceFromBelow = occurrenceAt(arr, target, index+1);
        list.addAll(occurrenceFromBelow);
        return list;
    }
}
