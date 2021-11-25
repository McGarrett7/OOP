package Week9;

public class ExpressionTest {

    public static void main(String[] args) {
        Expression n1 = new Numeral(10);
        Expression n2 = new Numeral(-3);
        Expression n3 = new Numeral(4);
        Expression n4 = new Numeral(3);
        Expression n5 = new Numeral(0);

        Square s = new Square(n1);
        Addition add = new Addition(s, n2);
        Multiplication multi = new Multiplication(n3, n4);
        Addition add1 = new Addition(add, multi);
        Square result1 = new Square(add1);
        System.out.println(result1 + " = " + result1.evaluate());

        Division result2 = new Division(n1, n5);
        System.out.println(result2 + " = " + result2.evaluate());
    }
}