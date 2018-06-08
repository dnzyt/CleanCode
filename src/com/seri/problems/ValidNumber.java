package com.seri.problems;

public class ValidNumber {

    public boolean isNumber(String s) {
        int i = 0;
        int n = s.length();

        while (i < n && Character.isWhitespace(s.charAt(i))) i++;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
        boolean res = false;
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = true;
            i++;
        }
        if (i < n && s.charAt(i) == '.') {
            i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                res = true;
            };
        }
        if (res && i < n && s.charAt(i) == 'e') {
            i++;
            res = false;
            if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) i++;
            while (i < n && Character.isDigit(s.charAt(i))) {
                i++;
                res = true;
            }
        }

        while (i < n && Character.isWhitespace(s.charAt(i))) i++;

        return res && i == n;
    }
}
