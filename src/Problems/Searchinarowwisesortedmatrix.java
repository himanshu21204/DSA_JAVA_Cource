package Problems;
// https://www.geeksforgeeks.org/problems/search-in-a-row-wise-sorted-matrix/1
public class Searchinarowwisesortedmatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(searchRowMatrix(arr,5));
    }
    public static boolean searchRowMatrix(int[][] mat, int x) {
        for(int[] i : mat){
            if(x>=i[0] && x<=i[i.length-1]){
                for (int num : i){
                    if(num == x) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

}
