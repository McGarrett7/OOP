package Week6;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(7, 7);
        Shape s1 = new Circle(p, 7, "red", true);
        Shape s2 = new Rectangle(p, 7, 8, "green", true);
        Shape s3 = new Square(p, 7, "blue", false);
        Shape s4 = new Square(p, 7, "blue", false);
        Layer l = new Layer();
        l.addShape(s1);
        l.addShape(s2);
        l.addShape(s3);
        l.addShape(s4);
        System.out.println(l.getInfo());
        l.removeDuplicates();
        System.out.println(l.getInfo());
        l.removeCircles();
        System.out.println(l.getInfo());
    }
}
