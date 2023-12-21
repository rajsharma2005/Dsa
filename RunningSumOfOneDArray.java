import java.util.Arrays;

public class RunningSumOfOneDArray {
    //https://leetcode.com/problems/running-sum-of-1d-array/description/
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ans[i] = nums[i] + ans[i-1];
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{
                1,2,3,4
        })));
    }
}
