package Test;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double length, double width) {
        super();
        this.length = length;
        this.width = width;
    }

    @Override
    public double Area() {
        return length * width;
    }

    //Draw
    public String toString() {
        return "Rectangle";
    }
}
