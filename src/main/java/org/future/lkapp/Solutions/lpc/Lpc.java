package org.future.lkapp.Solutions.lpc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Lpc {
    public String longestCommonPrefix(String[] strs) {

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
