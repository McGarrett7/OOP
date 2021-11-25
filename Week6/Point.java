package Week6;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * point.
     *
     */
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

    public double distance(Point z) {
        return Math.sqrt((pointX - z.pointX) * (pointX - z.pointX)
                + (pointY - z.pointY) * (pointY - z.pointY));
    }

    /**
     * chuyen.
     *
     */

    public boolean equals(Object object) {
        if (object instanceof Point) {
            Point p = (Point) object;
            //return pointX == p.pointX && pointY == p.pointY;
            return Double.compare(p.pointX, pointX) == 0
                && Double.compare(p.pointY, pointY) == 0;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }

    /**
     * chuyen.
     *
     */

    public String toString() {
        return "(" + Math.ceil(pointX * 10.0) / 10.0 + ","
                + Math.ceil(pointY * 10.0) / 10.0 + ")";
    }
}