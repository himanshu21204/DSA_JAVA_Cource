package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class NumberofDistinctIslands {
    public static void main(String[] args) {

    }
    int countDistinctIslands(int[][] grid) {
        Set<ArrayList<String>> set = new HashSet<>();
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(!vis[i][j] && grid[i][j] == 1){
                    ArrayList<String> temp = new ArrayList<>();
                    dfs(i,j,vis,grid,temp,i,j);
                    set.add(temp);
                }
            }
        }
        return set.size();
    }
    public static void dfs(int row,int col,boolean[][] vis,int[][] grid,ArrayList<String> temp,int brow,int bcol){
        vis[row][col] = true;
        temp.add((row - brow) + " " + (col - bcol));
        int n = grid.length;
        int m = grid[0].length;

        int[] drow = {-1,0,1,0};
        int[] dcol = {0,-1,0,1};

        for (int i = 0; i < 4; i++) {
            int nrow = row + drow[i];
            int ncol = col + dcol[i];

            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && !vis[nrow][ncol] && grid[nrow][ncol] == 1){
                dfs(nrow,ncol,vis,grid,temp,brow,bcol);
            }
        }
    }
}
