package org.future.lkapp.Solutions.palindrome;

public class Palindrome2 {
    public boolean isPalindrome(int x) {
        
        if (x / 10 == 0)
            return true;
        if (firstDigit(x) == x % 10) {
            if (x < 100) return true;
            return isPalindrome(cutFirstDigit(x)/10);
        }

        return false;
    }

    private int firstDigit(int x) {
        int firstDigit = x / 10;
        while (x / 10 > 10) {
            x = x / 10;
            firstDigit = x / 10;
        }
        return firstDigit;
    }

    private int cutFirstDigit(int number) {
        int digitsCount = (int)Math.floor(Math.log10(number)) + 1;
        
        return number % (int)Math.pow(10, digitsCount - 1); 
    }
}
