package org.future.lkapp.Solutions.lps;

public class LongestPalindromicSubstring {
    public String longestPalindromeRec(String s) {
        String result = "";
        if (s.length() < 1 || s.length() > 1000) {
            return "";
        }
        if (isPalindromeRec(s))
            return s;
        int leftIndex = 0;
        int maxLength = 0;
        String currentSubString;
        while (leftIndex < s.length()) {
            for (int i = leftIndex + 1; i <= s.length(); i++) {
                currentSubString = s.substring(leftIndex, i);
                if (currentSubString.length() > maxLength && isPalindromeRec(currentSubString)) {
                    maxLength = currentSubString.length();
                    result = currentSubString;
                }
            }
            leftIndex++;
        }
        return result;
    }

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


    private boolean isPalindromeRec (String s) {
        if (s.length() == 1) return true;

        if (s.charAt(0) == s.charAt(s.length() - 1 )){
            if (s.length() == 2) return true;
            return isPalindromeRec (s.substring(1, s.length() - 1));
        } 
        return false; 
    }
}
