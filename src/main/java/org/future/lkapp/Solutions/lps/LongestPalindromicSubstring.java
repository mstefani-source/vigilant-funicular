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
        if (isPalindrome(s))
            result = s;
        int leftIndex = 0;
        while (leftIndex < s.length() - 1) {
            for (int i = leftIndex + 1; i < s.length(); i++) {
                if (isPalindrome(s.substring(leftIndex, i))){
                    if (!setOfPalindromes.contains(s.substring(leftIndex, i))){
                        setOfPalindromes.add(s.substring(leftIndex,i));
                    }
                }
            }
            leftIndex++;
        }
        return findLongestString(setOfPalindromes);
    }

    private boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            if (s.length() == 2)
                return true;
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }

    private static String findLongestString(Set<String> set) {
        if (set.isEmpty()) {
            return null; // Если множество пустое, возвращаем null
        }
        
        String longest = "";
        
        for (String s : set) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        
        return longest;
    }
}
