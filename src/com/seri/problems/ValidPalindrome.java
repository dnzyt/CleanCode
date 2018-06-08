package com.seri.problems;

/*
* Given a string, determine if it is a palindrome, considering only alphanumeric characters and ingnoring cases.
* For example,
* "A man, a plan, a canal: Panama" is palindrome
* "race a car" is not a palindrome
* */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) r--;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r)))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
