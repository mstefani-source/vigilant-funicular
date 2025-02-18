package org.future.lkapp.Solutions.revint;

public class Solution7 {

    public int reverse(int x) {
        int result = 0;
        String str = Integer.toString(x);
        if (x >= -9 && x <= 9)
            return x;
        int sign = x < 0 ? -1 : 1;
        int index = str.length() - 1;
        while (index >= 0 && isDigit(str.charAt(index))) {
            if (result == Integer.MAX_VALUE / 10 && str.charAt(index) > '7' || result > Integer.MAX_VALUE / 10) {
                return 0;
            }
            result = result * 10 + (str.charAt(index) - '0');
            index--;
        }
        return result * sign;
    }

    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}