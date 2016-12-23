package lab.works._2._18;

import java.math.BigInteger;

public class _1_Main {

    public static void main(String[] args) {
        final int N = (int)(Math.random() * 40 + 10);
        System.out.println("factorial of 4 is " + factorial(4));
        System.out.format("factorial of N(%d) is %s%n", N, factorial(N));
    }

    private static BigInteger factorial(final Integer number) {
        BigInteger N = new BigInteger(number.toString());
        return recursiveFactorial(N);
    }

    private static BigInteger recursiveFactorial(BigInteger N) {
        boolean exit = !N.equals(new BigInteger("0"));
        BigInteger nDec = N.subtract(new BigInteger("1"));
        BigInteger lastInv = new BigInteger("1");
        return exit ? N.multiply(recursiveFactorial(nDec)) : lastInv;
        /*     N > 0 ? N * f(N - 1) : 1      */
    }
}
