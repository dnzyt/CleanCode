package com.seri.problems;

/*
* Similar to Reverser Words In A String, but there is no leading or trailing space and there is only one space between.
* */
public class ReverseWordsInAStringII {

    public void reverseWords(char[] s) {
        reverse(s, 0, s.length);
        for (int i = 0, j = 0; j <= s.length; j++) {
            if (j == s.length || s[j] == ' ') {
                reverse(s, i, j);
                i = j + 1;
            }
        }
    }


    private void reverse(char[] s, int begin, int end) {
        for (int i = 0; i < (end - begin) / 2; i++) {
            char temp = s[begin + i];
            s[begin + i] = s[end - 1 - i];
            s[end - 1 - i] = temp;
        }
    }
}
