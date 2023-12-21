import java.util.Arrays;

public class SpiralMatrix2 {
    //https://leetcode.com/problems/spiral-matrix-ii/description/
    public static int[][] generateMatrix(int n) {
        //we will start the matrix from 1 and we were given the size of array as n so we will use that

        //First lets create arr
        int[][] arr = new int[n][n];
        //we will get the array of size n

        // now we will define the corners of array
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;

        //we use k for matrix

        int k =1;
        //we will increment k's value one by one

        //we check if left <= right and top <= bottom

        while (left<= right && top <= bottom){
            //for first line we move towards right from left

            for (int i = left; i <= right; i++) {
                arr[top][i] = k;
                k++;
            }
            //now after completing first line we will increment top by 1
            top ++ ;
            //now we will go down in last line

            for (int i = top; i <= bottom ; i++) {
                arr[i][right] = k;
                k++;
            }
            //now we have reach to bottom-right corner so we decrement right by 1
            right--;

            // we can check that if left <= right and top <= bottom if it is true it will work else break the statement

            if (!(left<= right && top <= bottom)){
                break;
            }

            // now we will go back to index 0
            for (int i = right; i > left-1; i--) {
                arr[bottom][i] = k;
                k++ ;
            }
            // when we are on the bottom line we have to go up so we decrement bottom by 1
            bottom--;

            for (int i = bottom; i >= top ; i--) {
                arr[i][left] = k;
                k++;
            }
            left++;

        }
        return arr;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println(Arrays.toString(generateMatrix(3)));
//        }
        generateMatrix(3);
    }
}
