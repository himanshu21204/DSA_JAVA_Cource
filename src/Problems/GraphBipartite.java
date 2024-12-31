package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// https://www.geeksforgeeks.org/problems/bipartite-graph/
// https://leetcode.com/problems/is-graph-bipartite/
public class GraphBipartite {
    public static void main(String[] args) {

    }
    // This is Use in GFG
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        int V = adj.size();
        int[] vis = new int[V];
        Arrays.fill(vis, -1);

        for (int i = 0; i < V; i++) {
            if (vis[i] == -1) {
                if (!check(i, adj, vis)) return false;
            }
        }
        return true;
    }

    // This is Use in Leetcode
//    public boolean isBipartite(int[][] graph) {
//        int V = graph.length;
//        int[] vis = new int[V];
//        Arrays.fill(vis, -1);
//
//        for (int i = 0; i < V; i++) {
//            if (vis[i] == -1) {
//                if (!check(i, graph, vis)) return false;
//            }
//        }
//        return true;
//    }
    boolean check(int start, ArrayList<ArrayList<Integer>> graph, int[] vis) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        vis[start] = 0;

        while (!q.isEmpty()) {
            int temp = q.poll();
            for (int neighbor : graph.get(temp)) {
                if (vis[neighbor] == -1) {
                    vis[neighbor] = 1 - vis[temp];
                    q.add(neighbor);
                } else if (vis[neighbor] == vis[temp]) {
                    return false;
                }
            }
        }
        return true;
    }
}
