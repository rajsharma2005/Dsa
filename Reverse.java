import java.util.Scanner;

public class Reverse {
    //Program for reversing an Integer
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //we have just taken the number

        int ans  = 0;

        while (n>0){
            int rem = n%10;
            n = n/10;

            ans = ans*10+rem;
        }
        System.out.println(ans);
    }
}
