import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0 , b=1;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            int temp = a+b;
            a= b;
            b = temp;
        }
    }


}
