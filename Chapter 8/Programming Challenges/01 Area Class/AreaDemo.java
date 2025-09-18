public class AreaDemo {
    public static void main(String[] args) {
        double circleArea = Area.getArea(5.1);
        double rectangleArea = Area.getArea(25.9, 30.9);
        double cylinderArea = Area.getArea(3.6, 8.5, true);

        // Display the areas.
        System.out.printf("Area of circle: %.3f\n", circleArea);
        System.out.printf("Area of rectangle: %.3f\n", rectangleArea);
        System.out.printf("Area of cylinder: %.3f\n", cylinderArea);
    }
}
