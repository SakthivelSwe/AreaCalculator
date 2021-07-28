public class AreaCalculator {

    private static final String INVALID_VALUE_STRING = "Invalid value";

    public static double area(double radius) {
        if(radius < 0.0) {
            System.out.println(INVALID_VALUE_STRING);
            return -1;
        }

        double circle = (radius * radius)*Math.PI;
        System.out.println(circle);
        return circle;
    }

    public static double area(double x,double y) {

        if(x < 0.0 || y < 0.0) {
            System.out.println(INVALID_VALUE_STRING);
            return -1;
        }

        double rectangle = x * y;
        System.out.println(rectangle);
        return rectangle;
    }

}
