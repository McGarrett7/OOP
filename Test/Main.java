package Test;

public class Main {
    public static void main(String[] args) {
        Shape s1 = new Circle(7);
        Shape s2 = new Rectangle(7, 8);
        Shape s3 = new Square(7);
        System.out.println(s1.Area());
        System.out.println(s2.Area());
        System.out.println(s3.Area());

        //Draw
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
