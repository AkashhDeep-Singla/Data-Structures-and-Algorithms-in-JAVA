package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};
        List<List<Integer>> ans = dupeSubsetRemover(arr);
        for (List<Integer> sub: ans) {
            System.out.println(sub);
        }
    }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num: arr) {
            int subs = outer.size();
            for (int i=0; i<subs; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> dupeSubsetRemover(int[] arr) {
        // The array in above function can also have duplicate elements, and we know subsets can't be repeated so to prevent this
        Arrays.sort(arr); // first we sort the array so that duplicate elements become adjacent
        List<List<Integer>> outer = new ArrayList<>();
        int start = 0;
        int end = 0;
        for(int i=0; i<arr.length; i++) {
            // if current and previous element are same then set start to end+1'
            if(i>0 && arr[i] == arr[i-1]) {
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j <n; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
