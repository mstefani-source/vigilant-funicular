package lkapp.Solutions.reverseinteger;

public class ReverseInteger {
    public int reverse(int x) {
        int sign = 1;
        int result = 1;
        Boolean loopTrigger = true;
        if (x > -10 && x < 10)
            return x;
        if (x < 0) {
            sign = -1;
            x = x * sign;
        }
        int multiplicator = 10;
        while (loopTrigger) {
            result = result + (x % 10) * multiplicator;
            if (x / 10 == 0)
                loopTrigger = false;
            x = x / 10;
        }
        return result * sign;
    }
}
