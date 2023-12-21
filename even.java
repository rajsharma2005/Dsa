import java.util.Scanner;

public class even {

    public static void main(String[] args) {
        System.out.println("Please enter a number :");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        if (input%2 == 0){
            System.out.println(input + " is even");
        }else {
            System.out.println(input + " is odd");
        }
    }
}
