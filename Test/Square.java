package Test;

public class Square extends Shape {
    protected double side;

    public Square() {
        super();
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    @Override
    public double Area() {
        return side * side;
    }

    //Draw
    public String toString() {
        return "Square";
    }
}
