import java.util.ArrayList;
import java.util.List;

public class Candies {
    //https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
    public static int max(int[] arr){
        int max = 0;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int max = max(candies);
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max){
                list.add(i , true);
            }else {
                list.add(i , false);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {
                2,3,5,1,3
        };
        int extra = 3;
        System.out.println(kidsWithCandies(arr , extra));
    }

}
