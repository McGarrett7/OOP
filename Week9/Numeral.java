package Week9;

public class Numeral extends Expression {
    private double value;

    /**
     * a.
     * a.
     */
    public Numeral(double value) {
        this.value = value;
    }


    /**
     * a.
     * a.
     */
    public Numeral() {}

    @Override
    public String toString() {
        return "" + (int) value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}