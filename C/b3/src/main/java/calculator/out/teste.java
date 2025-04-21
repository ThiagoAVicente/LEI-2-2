import java.math.BigInteger;

public class teste {
    public static void main(String[] args) {
        BigInteger var1 = BigInteger.valueOf(2);
        BigInteger var2 = BigInteger.valueOf(3);
        BigInteger var3 = BigInteger.valueOf(4);
        BigInteger var4 = var2.multiply(var3);
        BigInteger var5 = var1.add(var4);
        BigInteger vary = var5;
        System.out.printf("%s = %d %n","y",vary.intValue());
        BigInteger var6 = BigInteger.valueOf(1);
        BigInteger var7 = BigInteger.valueOf(3);
        BigInteger var8 = var6.add(var7);
        BigInteger var9 = BigInteger.valueOf(1);
        var9 = var9.multiply(BigInteger.valueOf(-1));
        BigInteger var10 = var8.multiply(var9);
        System.out.printf("%s = %d %n","(1+3)*-1",var10.intValue());
        BigInteger var11 = BigInteger.valueOf(1);
        var11 = var11.multiply(BigInteger.valueOf(-1));
        var11 = var11.multiply(BigInteger.valueOf(-1));
        System.out.printf("%s = %d %n","--1",var11.intValue());
    }
}