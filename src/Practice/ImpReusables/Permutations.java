package Practice.ImpReusables;

import java.util.ArrayList;

public class Permutations {
    static ArrayList<String> permutationsList(String processed, String unprocessed) {
        System.out.println("Debug: processed = " + processed + ", unprocessed = " + unprocessed);

        if(unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            System.out.println("Debug: Adding permutation: " + processed);
            return list;
        }

        char ch = unprocessed.charAt(0);
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0; i<=processed.length(); i++) {
            String first = processed.substring(0, i);
            String second = processed.substring(i);
            ArrayList<String> recursive = permutationsList(first+ch+second, unprocessed.substring(1));
            System.out.println("Debug: Adding " + recursive.size() + " permutations to ans");
            ans.addAll(recursive);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Starting permutations calculation...");
        ArrayList<String> permutations = permutationsList("", "abc");
        System.out.println("Permutations of 'abc':");
        for (String perm : permutations) {
            System.out.println(perm);
        }
        System.out.println("Total permutations: " + permutations.size());
    }
}

//package Practice.ImpReusables;
//
//import java.util.ArrayList;
//
//public class Permutations {
//    public static void main(String[] args) {
////        permutations("", "abc");
//        ArrayList<String> ans = permutationsList("", "abc");
//        System.out.println("Permutations of 'abc':");
//        for (String perm : ans) {
//            System.out.println(perm);
//        }
//    }
//
//    static void permutations(String processed, String unprocessed) {
//        if(unprocessed.isEmpty()) {
//            System.out.println(processed);
//            return;
//        }
//        char ch = unprocessed.charAt(0);
//        for(int i=0; i<processed.length(); i++) {
//            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
//            permutations(first+ch+second, unprocessed.substring(1));
//        }
//    }
//
//    static ArrayList<String> permutationsList(String processed, String unprocessed) {
//        if(unprocessed.isEmpty()) {
//            ArrayList<String> list = new ArrayList<>();
//            list.add(processed);
//            return list;
//        }
//        char ch = unprocessed.charAt(0);
//        ArrayList<String> ans = new ArrayList<>();
//        for(int i=0; i<processed.length(); i++) {
//            String first = processed.substring(0, i);
//            String second = processed.substring(i, processed.length());
//            ans.addAll(permutationsList(first+ch+second, unprocessed.substring(1)));
//        }
//        return ans;
//    }
//}
