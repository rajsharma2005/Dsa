public class NumberWithEvenDigits {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (evenNumber(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean evenNumber(Integer num) {
        String str = num.toString();

        return str.length()%2 == 0;

    }

}
