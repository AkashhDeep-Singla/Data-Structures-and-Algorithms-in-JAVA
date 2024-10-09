package Practice.Recursion;

import java.util.ArrayList;
import java.util.List;

public class DiceCombos {
    public static void main(String[] args) {
        System.out.println(dice("", 3));
    }
    static List<String> dice(String processed, int target) {
        if(target == 0) {
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        List<String> list = new ArrayList<>();
        for(int i=1; i<=6 && i<=target; i++) {
            list.addAll(dice(processed+i, target-i));
        }
        return list;
    }
}
