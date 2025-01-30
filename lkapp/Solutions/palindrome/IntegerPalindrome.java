package lkapp.Solutions.palindrome;

public class IntegerPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String stringDigit = Integer.toString(x);
        
        return isPalindrome(stringDigit);
    }

    private boolean isPalindrome(String line) {
        if (line.length() == 1) return true;
        if (line.charAt(0) == line.charAt(line.length() - 1)){
            if (line.length() == 2) return true;
            return isPalindrome(line.substring(1, line.length() - 1));
        }
        return false;
    }
}
