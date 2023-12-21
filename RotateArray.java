import java.util.Arrays;

public class RotateArray {
    //https://leetcode.com/problems/rotate-array/description/

    public static void rotate(int[] nums, int k) {
//        for (int i = 0; i < k; i++) {
//            int last = nums[nums.length-1];
//            for (int j = nums.length-1; j >= 0; j--) {
//
//                if (j == 0){
//                    nums[0] = last;
//                }else {
//                    nums[j] = nums[j-1];
//                }
//            }
//        }


            int n = nums.length;
            k = k % n; // Handle cases where k is greater than the length of the

            reverse(nums, 0, n - 1); // Reverse the entire array
            reverse(nums, 0, k - 1); // Reverse the first k elements
            reverse(nums, k, n - 1); // Reverse the remaining elements
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        rotate(arr , k);
        System.out.println(Arrays.toString(arr));
    }
}
