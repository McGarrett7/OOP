package Week8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point(1,2), 3);
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(3, 0);
        Triangle triangle = new Triangle(p1, p2, p3);
        List<GeometricObject> list = new ArrayList<>();
        list.add(circle);
        list.add(triangle);
        ShapeUtil s = new ShapeUtil();
        System.out.println(s.printInfo(list));
        System.out.println("Triangle:");
        System.out.println(triangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println("Circle:");
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}