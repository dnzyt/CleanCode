package com.seri.problems;


/*
* Given an input string s, reverse the string word by word.
* For example, give s = " the sky is blue", return blue is sky the".
* */

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int j = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                j = i;
            } else if (i == 0 || s.charAt(i - 1) == ' ') {
                if (sb.length() != 0) {
                    sb.append(' ');
                }
                sb.append(s.substring(i, j));
            }
        }
        return sb.toString();
    }



}
