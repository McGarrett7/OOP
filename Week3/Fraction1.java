package Week3;

import java.util.*;

public class Fraction1 {

    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public Fraction1(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    Fraction1() {
        numerator = 1;
        denominator = 1;
    }

    int gcd(int a, int b) {
        if (b == 0) {
            if (a < 0) {
                return -a;
            } else {   // a >= 0
                return a;
            }
        }
        return gcd(b, a % b);
    }

    Fraction1 reduce() {
        int m = gcd(numerator, denominator);
        Fraction1 y = new Fraction1();
        y.denominator = denominator / m;
        y.numerator = numerator / m;
        if (y.denominator < 0 && y.numerator > 0) {
            y.denominator = -y.denominator;
            y.numerator = -y.numerator;
        }
        return y;
    }

    Fraction1 add(Fraction1 x) {
        Fraction1 y = new Fraction1();
        y.numerator = numerator * x.denominator + x.numerator * denominator;
        y.denominator = x.denominator * denominator;
        return y.reduce();
    }

    Fraction1 subtract(Fraction1 x) {
        Fraction1 y = new Fraction1();
        y.numerator = numerator * x.denominator - x.numerator * denominator;
        y.denominator = x.denominator * denominator;
        return y.reduce();
    }

    Fraction1 multiply(Fraction1 x) {
        Fraction1 y = new Fraction1();
        y.numerator = numerator * x.numerator;
        y.denominator = denominator * x.denominator;
        return y.reduce();
    }

    Fraction1 divide(Fraction1 x) {
        if (x.numerator == 0) {
            return x;
        }
        Fraction1 y = new Fraction1();
        y.numerator = numerator * x.denominator;
        y.denominator = denominator * x.numerator;
        return y.reduce();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fraction1) {      // kiểm tra obj có phải kiểu Solution
            Fraction1 a = (Fraction1) obj;
            if (subtract(a).numerator == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void print() {
        System.out.print(getNumerator() + "/" + getDenominator() + "\n");
    }

    public static void main(String[] args) {
        Fraction1 frac = new Fraction1 (4, 6);
        frac = frac.reduce();
        frac.print();
        frac = frac.subtract(new Fraction1(2, 8));
        frac.print();
        frac = frac.add(new Fraction1(-4, 6));
        frac.print();
        frac = frac.multiply(new Fraction1(2, 7));
        frac.print();
        frac = frac.divide(new Fraction1(5, 10));
        frac.print();
        System.out.println(frac.equals(new Fraction1(1, 2)));
    }
}