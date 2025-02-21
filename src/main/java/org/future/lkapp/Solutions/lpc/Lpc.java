package org.future.lkapp.Solutions.lpc;

public class Lpc {
    public String longestCommonPrefix(String[] strs) {

        int index = 0;
        String subs;
        String result = "";
        
        while (index <= strs[0].length()) {
            subs = strs[0].substring(0, index);
            for (String str : strs) {
                if (index > str.length() || !str.substring(0, index).equals(subs)) {
                    return result;  
                } 
            }
            result = subs;
            index++;
        }
        return result;
    }
}
