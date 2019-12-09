package custom_exception;

import java.util.Scanner;

public class Custom_Exception extends Exception {
    Custom_Exception(String s) {
        super(s);
    }
}

class MyCalculator {
    public static long power(int n, int p) {
        try {
            if (n == 0 && p == 0) {
                throw new Custom_Exception("n and p sholud not be zero");
            }
            if (n < 0 || p < 0) {
                throw new Custom_Exception("n or p shold not be negative");
            }
            /*if (n > 0) {
                throw new ArithmeticException("no");
            }*/
            return (long) Math.pow(n, p);
        } catch (Custom_Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        System.out.println(power(n, p));
    }
}
