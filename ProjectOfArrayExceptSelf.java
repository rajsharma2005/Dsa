import java.util.Arrays;

public class ProjectOfArrayExceptSelf {
    //https://leetcode.com/problems/product-of-array-except-self/description/

    public static int[] productExceptSelf(int[] nums) {
        //int[] answer = new int[nums.length];
//        int sum = 1;

//        for (int i = 0; i < nums.length; i++) {
//            answer[i] = 1;
//            for (int j = 0; j < nums.length; j++) {
//                if (j ==i){
//                    continue;
//                }else {
//                    answer[i] *= nums[j];
//                }
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]== 0){
//
//            }
//            sum *= nums[i];
//        }
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 0){
//                answer[i] = 0;
//            }else {
//                answer[i] = sum / nums[i];
//            }
//        }

        int n = nums.length;

        // Initialize two arrays to store the product of elements to the left and right of each index
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];

        // Initialize the answer array
        int[] answer = new int[n];

        // Calculate the product of elements to the left of each index
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            leftProducts[i] = leftProduct;
            leftProduct *= nums[i];
        }

        // Calculate the product of elements to the right of each index and simultaneously update the answer array
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = leftProducts[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return answer;




    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

}
