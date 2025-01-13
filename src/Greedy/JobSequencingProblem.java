package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
// https://www.geeksforgeeks.org/problems/job-sequencing-problem-1587115620/1
public class JobSequencingProblem {
    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        int n = id.length;
        int[][] job = new int[n][3];
        // Store id,deadline, profit in one 2D Array
        for(int i = 0; i<n; i++){
            job[i][0] = id[i];
            job[i][1] = deadline[i];
            job[i][2] = profit[i];
        }
        // sort 2D array based on profit
        Arrays.sort(job, (a, b) -> b[2] - a[2]);
        // find maximum deadline
        int max = 0;
        for(int i = 0; i<n; i++){
            max = Math.max(max, job[i][1]);
        }
        // now calculate total profit and job total
        int[] allocate = new int[max+1];
        int tprofit = 0;
        int count = 0;
        Arrays.fill(allocate, -1);
        for(int i = 0; i<n; i++){
            for(int j = job[i][1]-1; j>=0; j--){
                if(allocate[j] == -1){
                    allocate[j] = 1;
                    tprofit+= job[i][2];
                    count++;
                    break;
                }
            }
        }
        return new ArrayList<>(Arrays.asList(count, tprofit));
    }
}
