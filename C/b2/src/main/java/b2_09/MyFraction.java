public class MyFraction {

    private final int num;
    private final int den;

    public MyFraction(int num, int den){
        this.num = num;
        this.den = den;
    }

    public MyFraction add (MyFraction other){
        int newNum = (this.num * other.den) + (other.num * this.den);
        int newDen = this.den * other.den;

        int gcd = gcd(newNum,newDen);
        return new MyFraction(newNum/gcd,newDen/gcd);
    }
    public MyFraction add (int other){
        return add(new MyFraction(other,1));
    }

    public MyFraction sub (MyFraction other){
        int newNum = (this.num * other.den) - (other.num * this.den);
        int newDen = this.den * other.den;

        int gcd = gcd(newNum,newDen);
        return new MyFraction(newNum/gcd,newDen/gcd);
    }
    public MyFraction sub (int other){
        return add(new MyFraction(other,1));
    }

    public MyFraction multi(MyFraction other){
        int newNum = this.num * other.num;
        int newDen = this.den * other.den;

        int gcd = gcd(newNum,newDen);
        return new MyFraction(newNum/gcd,newDen/gcd);
    }
    public MyFraction multi(int other){
        return multi(new MyFraction(other,1));
    }

    public MyFraction div(MyFraction other){
        int newNum = this.num * other.den;
        int newDen = this.den * other.num;

        int gcd = gcd(newNum,newDen);
        return new MyFraction(newNum/gcd,newDen/gcd);
    }
    public MyFraction div(int other){
        return div(new MyFraction(other,1));
    }

    public float value(){
        return (float) num /den;
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public MyFraction pow(int exp){
        return new MyFraction((int)Math.pow(num,exp),(int)Math.pow(den,exp));
    }

    static public MyFraction reduce( MyFraction f){
        int gcd = gcd(f.num,f.den);
        return new MyFraction(f.num/gcd, f.den/gcd);
    }

    static public MyFraction fromText( String s){

        String[] parts = s.split("/");
        if ( parts.length == 1 ) return new MyFraction(Integer.parseInt(parts[0]),1);

        return new MyFraction(
                Integer.parseInt(parts[0].strip()),
                Integer.parseInt(parts[1].strip())
        );

    }
    public MyFraction mod(MyFraction other) {
        if (other.num == 0) {
            throw new ArithmeticException("Cannot divide by zero fraction");
        }

        // Passo 1: Divisão das frações
        int divisionNum = this.num * other.den;
        int divisionDen = this.den * other.num;

        // Passo 2: Parte inteira da divisão
        int integerPart = divisionNum / divisionDen;

        // Passo 3: Calcular o resto
        MyFraction product = other.multi(new MyFraction(integerPart, 1));
        return this.sub(product);
    }

    @Override
    public String toString() {
        return ( den == 1)? ""+num: num + "/" + den;
    }
}
