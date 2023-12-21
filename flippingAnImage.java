import java.util.Arrays;

public class flippingAnImage {
    //https://leetcode.com/problems/flipping-an-image/description/
    public static int[][] flipAndInvertImage(int[][] image) {
        image = flipImage(image);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }

    public static int[][] flipImage(int[][] image){
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length /2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length -1-j];
                image[i][image.length -1-j] = temp;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1,1,0,0},
                {1,0,0,1},
                {0,1,1,1},
                {1,0,1,0}
        };

        int[][] image = new int[4][4];
        image = flipImage(arr);

        for (int i = 0; i < arr.length; i++) {

            System.out.println(Arrays.toString(image[i]));

        }

        arr = flipAndInvertImage(arr);
//        for (int i = 0; i < arr.length; i++) {
//
//                System.out.println(Arrays.toString(arr[i]));
//
//        }
    }

}
