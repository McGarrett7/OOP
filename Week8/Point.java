package Week8;

public class Point {
    private double pointX;
    private double pointY;

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    public double distance(Point other) {
        return Math.sqrt((pointX - other.pointX) * (pointX - other.pointX)
                + (pointY - other.pointY) * (pointY - other.pointY));
    }

    @Override
    public String toString() {
        return "(" + String.format("%.2f", pointX) + ","
                + String.format("%.2f", pointY) + ")";
    }
}