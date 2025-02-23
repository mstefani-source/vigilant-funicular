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

        while (true) {

            String minPrefix = strs[0].substring(0, minlen);

            if (isPrefixedForAll(asl, minPrefix)) {
                return minPrefix;
            } else {
               minlen--; 
            }
        }
    }

    private boolean isPrefixedForAll(List<String> list, String prefix) {

        return list.stream()
                .allMatch(startWithPrefix(prefix));
    }

    private Predicate<String> startWithPrefix(String prefix) {
        return str -> str.startsWith(prefix);
    }

}
