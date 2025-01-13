package Greedy;

import java.util.Arrays;
// https://leetcode.com/problems/assign-cookies/
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Step 1: First Sort both Arrays
        Arrays.sort(g);
        Arrays.sort(s);

        int l = 0; // track 'g' array
        int r = 0; // track 's' array

        while (l < g.length && r < s.length){
            // Step 2: If we assign cookie to children, then we go next index
            if(g[l] <= s[r]){
                l++;
            }
            r++;
        }
        return l; // return r bcz that only below l student assign cookies
    }
}
