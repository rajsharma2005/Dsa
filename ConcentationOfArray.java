import java.util.Arrays;

public class ConcentationOfArray {
    //https://leetcode.com/problems/concatenation-of-array/description/

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[2* nums.length];
        for (int i = 0; i < 2*nums.length; i++) {
           if (i<3){
               ans[i] = nums[i];
           }else
               ans[i] = nums[i-3];

        }
//        for (int  j= nums.length; j< 2*nums.length; j++) {
//            int a = 0;
//            ans[a + nums.length +1] = nums[a];
//            a++;
//        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1, 2, 1})));
//        int[] ans = {1,2,3};
//        System.out.println(ans.length);
    }
}
