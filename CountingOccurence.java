import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
       while (n >0){
           if (n%10 == 5){
               count++;
           }
           n = n/10;
       }
        System.out.println(count);
    }
}
