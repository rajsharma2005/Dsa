import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if (a >b){
            if (a>c){
                System.out.println(a +" is largest");
            }else
                System.out.println(c +" is largest");
        }else {
            if (b > c){
                System.out.println(b +" is largest");
            }else
                System.out.println(c+ " is largest");
        }
    }
}
