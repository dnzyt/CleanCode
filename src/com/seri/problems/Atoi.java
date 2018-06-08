package com.seri.problems;

public class Atoi {

    private static final int maxDiv10 = Integer.MAX_VALUE / 10;

    public int atoi(String s) {
        int n = 0;
        int l = s.length();
        while (n < l && Character.isWhitespace(s.charAt(n))) n++;
        int sign = 1;
        int sum = 0;
        if (n < l) {
            if (s.charAt(n) == '+') n++;
            else if (s.charAt(n) == '-') {
                n++;
                sign = -1;
            }

        }
        while (n < l && Character.isDigit(s.charAt(n))) {
            int digit = Character.getNumericValue(s.charAt(n));
            if (sum > maxDiv10 || sum == maxDiv10 && digit >= 8)
                return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            sum = sum * 10 + digit;
            n++;
        }


        return sign * sum;
    }
}
