import java.util.*;

public class Main {
    public static void main(String[] args) {
//
//        System.out.println("Hello and welcome!");
//        System.out.println("Enter any integer");
//        Scanner sc = new Scanner(System.in);
//        int input = sc.nextInt();
//        System.out.println("You entered the " + input);

       // int a  = (int)(30.67);

//        if (true){
//            System.out.println("Yes");
//        }
//        int a = 5;
//        while(a == 5){
//            System.out.println(a);
//            a++;
//        }
//        System.out.println(a);
//        for(int i =0 ; i <= a; i++){
//            System.out.println(i);
//        }
//
//        int[] nums = new int[5];
//        //System.out.println(nums.length);
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(i);
        //}


//        int[][] arr = {
//                {1,2,3},
//                {1,2,3}
//        };
//        System.out.println(arr.length);


//        List<Boolean> mylist = new ArrayList<>();
//        mylist.set(0, true);



//        int rem = 2/10;
//
//        System.out.println(rem);
//
//        int a = (int) Math.sqrt(36);
//        System.out.println(a);


        for (int i = 0; i < 5; i++) {
            if (i == 1){
               break;
            }
            if (i == 2){
                System.out.println("it");
            }
            System.out.println(i);
        }


    }
    public static boolean hasUniqueLetters(String str) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the character is already in the set, it's a repeated letter
            if (!uniqueLetters.add(currentChar)) {
                return false;
            }
        }
        return true; // All letters are unique
    }
    public static boolean hasUniqueLetters2(String str) {
        Set<Character> uniqueLetters = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            // If the character is already in the set, it's a repeated letter
            if (!uniqueLetters.add(currentChar)) {
                return false;
            }
        }
        return true; // All letters are unique
    }




}