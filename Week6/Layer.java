package Week6;

import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape a) {
        shapes.add(a);
    }

    /**
     * remove.
     *
     */

    public void removeCircles() {
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(shapes.get(i));
            }
        }
    }

    /**
     * getInfo.
     *
     */

    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (Shape i : shapes) {
            info += i.toString() + "\n";
        }
        return info;
    }

    /**
     * remove.
     *
     */

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                }
            }
        }
    }
}