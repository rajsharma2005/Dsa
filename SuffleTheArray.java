import java.util.Arrays;

public class SuffleTheArray {
    //https://leetcode.com/problems/shuffle-the-array/description/

    public static int[] shuffle(int[] nums, int n) {
        int[] ans1 = new int[n];
        int[] ans2 = new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            if (i==0){
//                ans[0] = nums[0];
//            }else if (i == nums.length-1){
//                ans[nums.length-1] = nums[nums.length-1];
//            }else {
//            ans[i] = 0;
//            }
//        }

        for (int i = 0; i < nums.length; i++) {
            if (i < n){
                ans1[i] = nums[i];
            }else {
                ans2[i-n] = nums[i];
            }
        }
       int a = 1 , b=1;
        int[] ans = new int[2*n];

        ans[0] = nums[0];
        ans[nums.length-1] = nums[nums.length-1];
        for (int j = 1; j < nums.length-1; j++) {
            if (j%2 == 0){
                ans[j]  = ans1[j-a];
                a++;
            }else {
                ans[j] = ans2[j-b];
                b++;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr, 3)));
    }
}
