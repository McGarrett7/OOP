package Test;

public class Circle extends Shape {
    protected double radius;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double Area() {
        return Math.PI * radius * radius;
    }

    //Draw
    public String toString() {
        return "Circle";
    }

}