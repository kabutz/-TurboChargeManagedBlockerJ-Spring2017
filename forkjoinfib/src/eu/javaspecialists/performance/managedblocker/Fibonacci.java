package eu.javaspecialists.performance.managedblocker;

import java.math.*;

// TODO: Would you like to subscribe to my advanced Java newsletter?
// TODO: Or are you subscribed already and would like to say "hi"?
// TODO: Do both here: tinyurl.com/jspring17

// test100_000_000() time = 46953

public class Fibonacci {
    public BigInteger f(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;

        int half = (n + 1) / 2;

        BigInteger f0 = f(half-1);
        BigInteger f1 = f(half);

        if (n % 2 == 1) {
            return f0.multiply(f0).add(f1.multiply(f1));
        } else {
            return f0.shiftLeft(1).add(f1).multiply(f1);
        }
    }
}
