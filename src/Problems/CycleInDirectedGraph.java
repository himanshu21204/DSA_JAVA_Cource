package Problems;

import java.util.ArrayList;
import java.util.List;
// https://www.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/
public class CycleInDirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(List.of(1)));
        list.add(new ArrayList<>(List.of(2)));
        list.add(new ArrayList<>(List.of(3)));
        list.add(new ArrayList<>(List.of(3)));
        System.out.println(isCyclic(4,list));
    }
    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] vis = new int[V];
        int[] pathVis = new int[V];

        for (int i = 0; i < V; i++) {
            if(vis[i] == 0){
                if(dfs(i,vis,pathVis,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean dfs(int node,int[] vis,int[] pathVis,ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        pathVis[node] = 1;
        for (int num : adj.get(node)){
            if(vis[num] == 0){
                if(dfs(num,vis,pathVis,adj)){
                    return true;
                }
            }
            else if(pathVis[num] == 1) return true;
        }
        pathVis[node] = 0;
        return false;
    }
}
