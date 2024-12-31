package Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SetMatrixZeros {
    public static void main(String[] args) {

    }
    public void setMatrixZeroes(int[][] mat) {
//        List<List<Integer>> temp = new ArrayList<>();
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if(mat[i][j] == 0){
//                    List<Integer> list = new ArrayList<>();
//                    list.add(i);
//                    list.add(j);
//                    temp.add(list);
//                }
//            }
//        }
//
//        for (List<Integer> li : temp) {
//            for (int i = 0; i < mat.length; i++) {
//                mat[i][li.get(1)] = 0;
//            }
//            for (int i = 0; i < mat.length; i++) {
//                mat[li.getFirst()][i] = 0;
//            }
//        }
        int n = mat.length, m = mat[0].length;
        boolean firstZero = false;
        for (int i = 0; i < n; i++) {
            if (mat[i][0] == 0) firstZero = true;
            for (int j = 1; j < m; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }
        if (mat[0][0] == 0) {
            for (int j = 0; j < m; j++) mat[0][j] = 0;
        }
        if (firstZero) {
            for (int i = 0; i < n; i++) mat[i][0] = 0;
        }
    }
}

//List<Integer> is = new ArrayList<Integer>();
//List<Integer> js = new ArrayList<Integer>();
//        int n = mat.length, m=mat[0].length;
//        for(int i=0; i<n; i++) {
//        for(int j=0; j<m; j++) {
//        if(mat[i][j]==0) {
//        if(!is.contains(i)) is.add(i);
//                    if(!js.contains(j)) js.add(j);
//                }
//                        }
//                        }
//
//                        for(int i=0;i<is.size(); i++) {
//        for(int j=0;j<m; j++) {
//mat[is.get(i)][j]=0;
//        }
//        }
//        for(int j=0;j<js.size(); j++) {
//        for(int i=0;i<n; i++) {
//mat[i][js.get(j)]=0;
//        }
//        }