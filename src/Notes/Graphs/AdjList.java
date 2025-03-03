package Notes.Graphs;

import java.util.ArrayList;

public class AdjList {
    public static void main(String[] args) {
        int n = 3;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<=n; i++) {
            adj.add(new ArrayList<>());
        }
        // edge 1-----2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // edge 1-----3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // edge 3-----2
        adj.get(3).add(2);
        adj.get(2).add(3);

        for(int i=0; i<n; i++) {
            for(int j=0; j<adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
