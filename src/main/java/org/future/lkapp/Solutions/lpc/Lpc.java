package org.future.lkapp.Solutions.lpc;

public class Lpc {
    public String longestCommonPrefix(String[] strs) {

        int index = 0;
        String subs = "";
        String result = "";
        boolean weReachTheEnd = true;
        while (weReachTheEnd) {
            result = subs;
            subs = strs[0].substring(0, index);
            weReachTheEnd = true;
            for (String str : strs) {
                if (!str.substring(0, index).equals(subs)) {
                    weReachTheEnd = false;
                    return result;
                    // result = strs[0].substring(0, index);// return strs[0].substring(0, index);
                } 
                // if (str.length() <= index)  weReachTheEnd = true;
            }
            index++;
        }
        return result;
    }
}
