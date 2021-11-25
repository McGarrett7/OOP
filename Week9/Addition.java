package Week9;

public class Addition extends BinaryExpression {

    /**
     * a.
     * a.
     */
    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }
}