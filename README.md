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

<h4>Laboratory work 2.18.2</h4>

<p>Create new project called TestCore2. Add package “com.brainacad.oop.testcore2”.
   Write a program that counts how many nails can be purchased at $1 and what will 
   surrender if they buy one of each kind of the nail 
   (nails cost: $0.1, $0.2, $0.3, etc). The program output must be like next example:
   4 items bought.</p>
   <p>Money left over: $0.00</p>
   
```java
public class _2_Main {

    public static void main(String[] args) {

        labWork_2_18_2();
        nailsBuyingReport(new BigInteger("1"), new BigDecimal("0.4"));
    }

    private static void labWork_2_18_2() {
        BigInteger amount = new BigInteger("1");
        BigDecimal step = new BigDecimal("0.1");
        BigDecimal counter = new BigDecimal(step.toString());
        BigDecimal lastNail = new BigDecimal("0.4");
        BigDecimal surrender = new BigDecimal(amount.toString());

        for(counter = new BigDecimal("0.1");
            counter.compareTo(lastNail) <= 0;
            counter = counter.add(step))
        {
            surrender = surrender.subtract(counter);
        }

        NumberFormat curDef = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println("Money left over: " + curDef.format(surrender));
    }

    private  static void nailsBuyingReport(BigInteger amount, BigDecimal nailPrize) {
        BigDecimal surrender = new BigDecimal(amount.toString());
        BigDecimal counter = new BigDecimal("0");

        while(surrender.compareTo(nailPrize) >= 0) {
            surrender = surrender.subtract(nailPrize);
            counter = counter.add(new BigDecimal("1"));
        }

        NumberFormat curDef = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.format("Money left over: %s, number of nails bought: %s%n",
                          curDef.format(surrender), counter);
    }
}
```