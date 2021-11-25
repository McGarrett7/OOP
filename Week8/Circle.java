package Week8;

public class Circle implements GeometricObject {
    public static final double pi = 3.14;
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * pi * radius;
    }

    @Override
    public double getArea() {
        return pi * radius * radius;
    }

    @Override
    public String getInfo() {
        return "Circle[" + center + ",r=" + String.format("%.2f", radius) + "]";
    }
}