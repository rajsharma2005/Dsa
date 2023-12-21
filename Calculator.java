import java.util.Scanner;

public class Calculator {
    //A simple calculator program which will gonna terminate when you press x

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ans = 0;

        while (true){
            System.out.println("Enter the operator");
            char op = scanner.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter the numbers");
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (op == '+'){
                    ans = a+b;
                }
                if (op == '-'){
                    ans = a-b;
                }
                if (op == '*'){
                    ans = a*b;
                }
                if (op == '/'){
                   if (b>0){
                       ans = a/b;
                   }
                }
                if (op == '%'){
                    if (b>0){
                        ans = a%b;
                    }
                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else
                System.out.println("Invalid operation!");

            System.out.println(ans);
        }


    }
}
