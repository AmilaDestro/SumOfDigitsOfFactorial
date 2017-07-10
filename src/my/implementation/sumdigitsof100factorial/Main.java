package my.implementation.sumdigitsof100factorial;


import java.math.BigInteger;

public class Main {
    private static final int N = 100;

    public static void main(String[] args) {
        BigInteger factorial = FactorialDigitsSum.factorial(N);
        System.out.println("100! = " + factorial);
        System.out.println("Sum of digits: " + FactorialDigitsSum.sumOfDigits(factorial));
    }
}
