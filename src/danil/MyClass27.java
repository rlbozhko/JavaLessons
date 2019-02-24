package danil;

import java.math.BigInteger;

public class MyClass27 {
    public static void main(String[] args) {
        for (Integer integer = 20; integer < 20000; integer++) {
            BigInteger bigInteger = BigInteger.valueOf(integer);
            boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
            if (probablePrime) {
                System.out.println("Is the number " + integer + " natural? " + probablePrime);
            }
        }
    }
}
