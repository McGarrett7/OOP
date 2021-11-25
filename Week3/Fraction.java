package Week3;

import java.util.*;

public class Fraction {

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

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            this.denominator = 1;
        }
    }

    Fraction() {
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

    Fraction reduce() {
        int m = gcd(getNumerator(), getDenominator());
//        if (this.numerator * this.denominator < 0) {
//            setNumerator(-Math.abs(this.numerator / g));
//            setDenominator(Math.abs(this.denominator / g));
//        } else {
//            setNumerator(Math.abs(this.numerator / g));
//            setDenominator(Math.abs(this.denominator / g));
//        }
        this.denominator = denominator / m;
        this.numerator = numerator / m;
        if (this.denominator < 0 && this.numerator > 0) {
            this.denominator = -this.denominator;
            this.numerator = -this.numerator;
        }
        return this;
    }

    Fraction add(Fraction y) {
        int a = getNumerator();
        int b = getDenominator();
        int c = y.getNumerator();
        int d = y.getDenominator();
        setNumerator(a * d + b * c);
        setDenominator(b * d);
        return reduce();
    }

    Fraction subtract(Fraction y) {
        int a = getNumerator();
        int b = getDenominator();
        int c = y.getNumerator();
        int d = y.getDenominator();
        setNumerator(a * d - b * c);
        setDenominator(b * d);
        return reduce();
    }

    Fraction multiply(Fraction y) {
        int a = getNumerator();
        int b = getDenominator();
        int c = y.getNumerator();
        int d = y.getDenominator();
        setNumerator(a * c);
        setDenominator(b * d);
        return reduce();
    }

    Fraction divide(Fraction y) {
        int a = getNumerator();
        int b = getDenominator();
        int c = y.getNumerator();
        int d = y.getDenominator();
        if (c == 0) {
            return this;
        }
        setNumerator(a * d);
        setDenominator(b * c);
        return reduce();
    }

    public boolean equals(Object obj) {
        if (obj instanceof Fraction) {      // kiểm tra obj có phải kiểu Solution
            Fraction a = (Fraction) obj;
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
        Fraction frac = new Fraction (4, 6);
        frac.reduce();
        frac.print();
       //System.out.println(frac.getNumerator() + "/" + frac.getDenominator() + "\n");
        Fraction frac1 = new Fraction (4, 7);
        frac1.subtract(new Fraction(2, 8));
        frac1.print();
        Fraction frac2 = new Fraction (1, 7);
        frac2.add(new Fraction(-4, 6));
        frac2.print();
        Fraction frac3 = new Fraction (5, 6);
        frac3.multiply(new Fraction(2, 7));
        frac3.print();
        Fraction frac4 = new Fraction (4, 7);
        frac4.divide(new Fraction(5, 10));
        frac4.print();
        Fraction frac5 = new Fraction (1, 2);
        System.out.println(frac5.equals(new Fraction(1, 2)));
    }
}