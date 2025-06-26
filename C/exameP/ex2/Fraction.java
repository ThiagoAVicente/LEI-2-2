public class Fraction {
    private int num;
    private int den;

    public Fraction(int n, int d) {
        if (d == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.num = n;
        this.den = d;
        reduceThis(); // optional: auto reduce upon creation
    }

    public float val() {
        return (float) num / den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public static Fraction reduce(Fraction f) {
        int gcd = gcd(Math.abs(f.num), Math.abs(f.den));
        int reducedNum = f.num / gcd;
        int reducedDen = f.den / gcd;
        if (reducedDen < 0) { // keep denominator positive
            reducedNum = -reducedNum;
            reducedDen = -reducedDen;
        }
        return new Fraction(reducedNum, reducedDen);
    }

    public static Fraction add(Fraction a, Fraction b) {
        int lcm = lcm(a.den, b.den);
        int num = a.num * (lcm / a.den) + b.num * (lcm / b.den);
        return reduce(new Fraction(num, lcm));
    }

    public static Fraction minus(Fraction a, Fraction b) {
        int lcm = lcm(a.den, b.den);
        int num = a.num * (lcm / a.den) - b.num * (lcm / b.den);
        return reduce(new Fraction(num, lcm));
    }

    public static Fraction mult(Fraction a, Fraction b) {
        return reduce(new Fraction(a.num * b.num, a.den * b.den));
    }

    public static Fraction div(Fraction a, Fraction b) {
        if (b.num == 0) {
            throw new ArithmeticException("Division by zero fraction");
        }
        return reduce(new Fraction(a.num * b.den, a.den * b.num));
    }

    // Helper for reducing instance internally
    private void reduceThis() {
        int gcd = gcd(Math.abs(num), Math.abs(den));
        num /= gcd;
        den /= gcd;
        if (den < 0) {
            num = -num;
            den = -den;
        }
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    @Override
    public String toString() {
        if ( den == 1){
            return String.format("%d", num);
        }
        return String.format("%d/%d", num, den);
    }
}
