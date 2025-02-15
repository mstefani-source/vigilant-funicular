package org.future.lkapp.Solutions.lps;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String result = "";
        if (s.length() < 1 || s.length() > 1000) {
            return "";
        }
        if (isPalindrome(s))
            return s;
        int leftIndex = 0;
        int maxLength = 0;
        String currentSubString;
        while (leftIndex < s.length()) {
            for (int i = leftIndex + 1; i <= s.length(); i++) {
                currentSubString = s.substring(leftIndex, i);
                if (currentSubString.length() > maxLength && isPalindrome(currentSubString)) {
                    maxLength = currentSubString.length();
                    result = currentSubString;
                }
            }
            leftIndex++;
        }
        return result;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
