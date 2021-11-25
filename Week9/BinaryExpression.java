package Week9;

public abstract class BinaryExpression extends Expression {
    public Expression left;
    public Expression right;

    /**
     * a.
     * a.
     */
    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}