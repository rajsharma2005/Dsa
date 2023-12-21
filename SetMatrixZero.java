import java.util.Arrays;

public class SetMatrixZero {
    //https://leetcode.com/problems/set-matrix-zeroes/description/

    public static void setZeroes(int[][] matrix) {
//        int[][] ans = new int[matrix.length][matrix[0].length];

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                ans[i][j] = matrix[i][j];
//                if (matrix[i][j] == 0){
//                    for (int k = 0; k < matrix.length; k++) {
//                        ans[k][j] = 0;
//                    }
//                    for (int k = 0; k < matrix[0].length; k++) {
//                        ans[i][k] = 0;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(Arrays.toString(ans[i]));
//        }


        boolean rawZero = false;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j]==0){
                    matrix[0][j] = 0;
                    if (i > 0){
                        matrix[i][0] = 0;
                    }else {
                        rawZero = true;
                    }
                }
            }



        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (matrix[0][0] == 0){
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if (rawZero){
            for (int i = 0 ; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }
        
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }


    }
}
