package Notes.Graphs;

import java.util.ArrayList;

public class DFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int n = 9;
        for (int i = 1; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(4);
        adj.get(4).add(1);
        adj.get(1).add(5);
        adj.get(5).add(1);
        adj.get(1).add(3);
        adj.get(3).add(2);
        adj.get(2).add(6);
        adj.get(6).add(2);
        adj.get(6).add(7);
        adj.get(7).add(6);
        adj.get(3).add(7);
        adj.get(7).add(3);



        ArrayList<Integer> dfsResult = DFS.dfsOfGraph(n, adj);
        System.out.println(dfsResult);
    }

    public static ArrayList<Integer> dfsOfGraph(int n, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[n];
        int start = 0;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(start, adj, vis, ls);
        return ls;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis, ArrayList<Integer> ls) {
        vis[node] = 1;
        ls.add(node);
        for (int it : adj.get(node)) {
            if (vis[it] == 0) {
                dfs(it, adj, vis, ls);
            }
        }
    }
}
