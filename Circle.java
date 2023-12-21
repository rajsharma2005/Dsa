public class Circle {
    public static double area(double r){
        double area ;
        area = Math.PI * Math.pow(r , 2);

        return area;
    }
    public static double circumference(double r){
        double circumference ;
        circumference = 2 *Math.PI * r;

        return circumference;
    }



    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(circumference(5));
    }
}
