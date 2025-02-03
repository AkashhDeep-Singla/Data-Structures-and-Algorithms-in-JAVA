package Practice;
import java.util.HashMap;
import java.util.Map;

public class DistinctSumPairs {
    static int countDistinctPairs(int[] arr, int target) {
        int res = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int j : arr) {
            int complement = target - j;
            if (complement == j) {
                if (countMap.getOrDefault(complement, 0) == 1)
                    res++;
            } else if (countMap.getOrDefault(complement, 0) > 0 &&
                    countMap.getOrDefault(j, 0) == 0) {
                res++;
            }
            countMap.put(j, countMap.getOrDefault(j, 0) + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 7, 7, 8};
        int target = 13;

        System.out.println(countDistinctPairs(arr, target));
    }
}