package Week8;

import java.util.ArrayList;
import java.util.List;

public class ShapeUtil {

    /**
     * a.
     * a.
     * a.
     */
    public String printInfo(List<GeometricObject> shapes) {
        List<Circle> circles = new ArrayList<>();
        List<Triangle> triangles = new ArrayList<>();
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                circles.add((Circle) shape);
            } else {
                triangles.add((Triangle) shape);
            }
        }
        List<String> list = new ArrayList<>();
        list.add("Circle:\n");
        for (Circle c : circles) {
            list.add(c.getInfo() + "\n");
        }
        list.add("Triangle:\n");
        for (Triangle t : triangles) {
            list.add(t.getInfo() + "\n");
        }
        String print = String.join("", list);
        return(print);
    }
}