package my.implementation.sumdigitsof100factorial;


import java.math.BigInteger;


public class FactorialDigitsSum {

    /*
     * Method calculates factorial of transmitted number
     */
    static BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        if(n == 0) {
            return factorial;
        }
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    /*
     * Method converts passed BigInteger number into array of integers
     * and calculates their sum.
     */
    protected static int sumOfDigits(BigInteger f) {
        char[] chars = f.toString().toCharArray();
        /*
         In the previous line we have got array of characters from BigInteger number.
         Below they are getting transformed into digits that are saved to array of integers.
         */
        int[] digits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            digits[i] = Character.getNumericValue(chars[i]);
        }
        // Foreach loop calculates sum of obtained digits.
        int sum = 0;
        for (int digit: digits){
            sum += digit;
        }
        return sum;
    }
}
