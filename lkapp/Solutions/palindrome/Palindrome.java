package lkapp.Solutions.palindrome;
        //         5
        // 0 1 2 3 4
        // s m i l e
public class Palindrome {

    
    public boolean isPalindrome (String s) {
        if (s.length() == 1) return true;

        if (s.charAt(0) == s.charAt(s.length() - 1 )){
            if (s.length() == 2) return true;
            return isPalindrome (s.substring(1, s.length() - 1));
        } 
        return false; 
    }
}
