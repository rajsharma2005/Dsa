public class MinMaxFunction {
    //make two functions to find the max and min number
    public static void main(String[] args) {
        int a= 3 , b = 5 , c=6;
        System.out.println(max(a,b,c));
        System.out.println(min(a,b,c));
    }
    public static int max(int a,int b,int c){
        if (a >b){
            if (a>c){
                return a;
            }else
                return c;
        }else {
            if (b > c){
                return b;
            }else
                return c;
        }
    }
    public static int min(int a,int b,int c){
        if (a <b){
            if (a<c){
                return a;
            }else
                return c;
        }else {
            if (b < c){
                return b;
            }else
                return c;
        }
    }
}
