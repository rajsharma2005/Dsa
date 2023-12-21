import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    //https://leetcode.com/problems/spiral-matrix/
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
//        int i = 0;
//        int j = 0;
//        while (i < matrix.length){
//            while (j < matrix[0].length){
//               list.add(matrix[i][j]);
//               if (j == matrix[0].length -1 && i < matrix.length-1){
//                   i++;
//               }else {
//                   j++;
//               }
//               if (i == matrix.length -1 && j > 0){
//                   j--;
//               }
//
//            }
//
//        }

//
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j <=matrix[0].length; j++) {
//                if ( j == matrix.length ){
//                    j -= 3;
//                    list.add(matrix[i][matrix.length-2]);
//                }
//               list.add(matrix[i][j]);
//
//                if (j ==1 && i ==1){
//                    i += 2;
//                    break;
//                }
//                if (j == matrix[0].length -1 && i < matrix.length-1){
//
//                    j--;
//                    i++;
//                }
//                if (i == matrix.length-1  && j>= 0 && j != matrix.length-1&& j != matrix[0].length-2){
//                    if (j == matrix[0].length-1){
//                        j -= 3;
//                    }else if (j == 0){
//                        j--;
//                        i--;
//                    }else {
//                        j -= 2;
//                    }
//                }

                //&& j != matrix.length-1
                //&&   j != matrix[0].length-2


//                if (i == matrix.length-1 && j < matrix[0].length-1 && j >= 0){
//                   if (j ==0){
//                       j--;
//                       i--;
//                   }else if(j == matrix[0].length-2){
//                       break;
//                   }else {
//                       j -= 2;
//                   }
//
//                }

//            }
//        }

        int s = 0;
        int e = matrix[0].length;
        int top = 0;
        int bottom = matrix.length;


        while (s < e && top < bottom){
            for (int i = s; i < e; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i < bottom; i++) {
                list.add(matrix[i][e-1]);
            }
            e--;
            if (!(s < e && top < bottom)){
                break;
            }
            for (int i = e-1; i > s-1; i--) {
                list.add(matrix[bottom-1][i]);
            }
            bottom--;
            for (int i = bottom-1; i > top-1; i--) {
                list.add(matrix[i][s]);
            }
            s++;

        }



        return list;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };


        System.out.println(spiralOrder(arr));
    }
}
