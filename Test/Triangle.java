package Test;

public class Triangle extends Shape {
    protected double a;
    protected double b;

    public Triangle() {
        super();
    }

    public Triangle(double day, double chieucao) {
        super();
        this.a = day;
        this.b = chieucao;
    }

    @Override
    public double Area() {
        return 1/2 * a * b;
    }

    //Draw
    public String toString() {
        return "Triangle]";
    }
}
