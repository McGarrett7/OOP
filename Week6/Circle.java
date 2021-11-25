package Week6;

import java.util.Objects;

public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * circle.
     *
     */

    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * chuyen.
     *
     */

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0
                && Objects.equals(center, circle.center);
    }

    public int hashCode() {
        return Objects.hash(center, radius);
    }

    /**
     * chuyen.
     *
     */

    public String toString() {
        return "Circle[center=" + center.toString() + ",radius="
                + radius + ",color=" + color
                + ",filled=" + filled + ']';
    }
}