package org.future.lkapp.Solutions.atoi;

public class MyInteger {
    public int atoi(String s) {
        int result = 0;
        if (s.isBlank()) {
            return result;
        }
        String trimmedString = s.trim();
        int start = 0;
        int sign = 1;

        if (trimmedString.charAt(0) == '-' || trimmedString.charAt(0) == '+') {
            start++;
        }
        if (trimmedString.charAt(0) == '-') {
            sign = -1;
        }
        int index = start;

        while (index < trimmedString.length() && isDigit(trimmedString.charAt(index))) {
            if ( result == Integer.MAX_VALUE / 10 && trimmedString.charAt(index) - '0' > 7 || result > Integer.MAX_VALUE / 10) {
                if (sign < 0) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }

            result = result * 10 + (trimmedString.charAt(index) - '0');
            index++;
        }
        return result * sign;
    }

    private boolean isDigit(char ch){
        return ch - '0' >= 0 && ch - '0' <= 9;
    }

}
