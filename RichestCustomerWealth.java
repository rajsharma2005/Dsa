import java.util.Arrays;

public class RichestCustomerWealth {
    //https://leetcode.com/problems/richest-customer-wealth/description/

//    public static int maximumWealth(int[][] accounts) {
//        int[] ans = new int[accounts.length];
//        for (int i = 0; i < accounts.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < accounts[i].length; j++) {
//                sum += accounts[i][j];
//                ans[i] = sum;
//            }
//        }
//        return max(ans);
//    }
//    public static int max(int[] arr){
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,5} ,
                {7,3} ,
                {3,5}
        };
        System.out.println(maximumWealth(arr));
    }

    private static int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            max = Math.max(max , sum);
        }
        return max;

    }


}
