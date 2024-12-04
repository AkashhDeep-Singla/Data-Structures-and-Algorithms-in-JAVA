package Notes.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        int vertices = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // Initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(3);

        ArrayList<Integer> result = bfsOfGraph(vertices, adj);
        System.out.println("BFS traversal: " + result);
    }

    static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> bfs = new ArrayList<>();

        visited[0] = true;
        queue.offer(0);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);

            // Iterate through adjacent nodes
            for (Integer neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
        return bfs;
    }
}