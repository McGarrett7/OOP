package Week8;

public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * a.
     * a.
     * a.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        double s1 = p1.distance(p2);
        double s2 = p2.distance(p3);
        double s3 = p3.distance(p1);
            if((s3 == s1 + s2) || (s2 == s1 + s3) || (s1 == s2 + s3)
                    || (p1.equals(p2) || p2.equals(p3) || p3.equals(p1))) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public double getArea() {
        return Math.abs(p1.getPointX() * (p2.getPointY() - p3.getPointY())
                + p2.getPointX() * (p3.getPointY() - p1.getPointY())
                + p3.getPointX() * (p1.getPointY() - p2.getPointY())) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return s1() + s2() + s3();
    }

    @Override
    public String getInfo() {
        return "Triangle[" + p1 + "," + p2 + "," + p3 + "]";
    }

    private double s1() {
        return p1.distance(p2);
    }

    private double s2() {
        return p2.distance(p3);
    }

    private double s3() {
        return p3.distance(p1);
    }
}