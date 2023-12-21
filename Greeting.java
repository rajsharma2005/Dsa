import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("Please enter your name :");
        Scanner scanner =new Scanner(System.in);
        System.out.println("Welcome "+ scanner.nextLine());
    }
}
