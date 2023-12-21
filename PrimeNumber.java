import java.util.ArrayList;

public class PrimeNumber {
    //find whether a number is prime or not
    public static boolean prime(int a){
        for (int i = 2; i < a/2; i++) {
            if (a%i == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(prime(3));


        ArrayList<String> str= new ArrayList<>();

    }
}
