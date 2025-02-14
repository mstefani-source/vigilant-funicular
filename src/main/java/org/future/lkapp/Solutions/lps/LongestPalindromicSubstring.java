package org.future.lkapp.Solutions.lps;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        if (s.length() < 1 || s.length() > 1000) {
            return result;
        }
        Set<String> setOfPalindromes = new HashSet<>();
        
        return result;
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.charAt(1) == s.charAt(s.length() - 1)) {
            if (s.length() == 2)
                return true;
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
