package lab.works._2._18;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Locale;

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
