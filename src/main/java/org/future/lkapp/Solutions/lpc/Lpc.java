package org.future.lkapp.Solutions.lpc;
import java.util.Arrays;
import java.util.List;

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

    public String longestCommonPrefix2(String[] strs) {

        List<String> asl = Arrays.asList(strs);

        Integer minlen = asl.stream()
                .map(str -> str.length()).min(Integer::compare).get();

        String minPrefix = strs[0].substring(0, minlen);
        for (int i = 1; i < strs.length; i++) {
            String strToCheck = strs[i];
            while (!strToCheck.startsWith(minPrefix)) {
                minlen--;
                minPrefix = strs[0].substring(0, minlen);
            }
            if (minPrefix.equals("")) return "";
        }
        return minPrefix;
    }

}
