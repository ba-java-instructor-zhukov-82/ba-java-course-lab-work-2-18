<h2><span>Brain Academy. Laboratory Work 2.18.
<br>(Core Java classes)</span></h2>

<h4>Laboratory work 2.18.1</h4>

<p>Create new project called TestCore1. Add package “com.brainacad.oop.testcore1”.</p>
<p>Write program which calculates the factorial of N, where N is set at random in 
   the range of 10 to 50 (use BigInteger to get the result).</p>
   
<ol>
    <li>Create a class Main with a factorial() method, which takes one argument 
        as an integer number N and returns it the factorial.</li>
    <li>Add in Main class the main() method, which defines a positive integer number, 
        passes it to the method factorial() and prints the result.</li>
    <li>Execute the program.</li>
</ol>

<p><b>The program output must be like next example:</b><br>
   <i>34! = 295232799039604140847618609643520000000</i></p>

```java  
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
```

