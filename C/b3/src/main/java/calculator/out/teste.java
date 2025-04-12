import java.math.BigInteger;

public class teste {
    public static void main(String[] args) {
        BigInteger var1 = BigInteger.valueOf(1);
        BigInteger var2 = BigInteger.valueOf(4);
        BigInteger var3 = var1.add(var2);
        System.out.printf("= %d %n",var3.intValue());
        BigInteger var4 = BigInteger.valueOf(1);
        BigInteger varx = var4;
        BigInteger var5 = BigInteger.valueOf(123);
        BigInteger vary = var5;
        BigInteger var6 = BigInteger.valueOf(2);
        BigInteger var7 = vary.remainder(var6);
        System.out.printf("= %d %n",var7.intValue());
    }
}