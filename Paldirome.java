import java.util.Scanner;

public class Paldirome {
    public static void main(String[] args) {

//        boolean palindrome = false;
//
//        System.out.println("Enter the string");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        for (int i = 0 ; i <= input.length()/2 ; i++){
//            if (input.charAt(i) != input.charAt(input.length()-i-1)){
//                System.out.println("It is not palindrome");
//                palindrome = false;
//                break;
//            }
//            palindrome = true;
//
//        }
//
//        if (palindrome){
//            System.out.println("It is palindrome");
//        }


        System.out.println("Please enter a string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (isPalindrome(str))
            System.out.println("It is palindrome");
        else
            System.out.println("It is not palindrome");




    }

    public static boolean isPalindrome(String str){
        str = str.replaceAll(" ", "").toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end))
                return false;


            start++;
            end--;

        }
        return true;
    }
}
