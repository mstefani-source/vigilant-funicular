package lkapp.Solutions.lengthoflongestsubstring;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        int first = 0;
        int second = 0;
        int length = 0;
        int sizeAfterAddChar = 0;
        Set<Character> longestSubString = new HashSet<Character>();
        int sizeBeforeAddChar = 0;
        char[] sCharArray = s.toCharArray();

        while (second < sCharArray.length) {
            sizeBeforeAddChar = longestSubString.size();
            longestSubString.add(sCharArray[second]);
            sizeAfterAddChar = longestSubString.size();

            if (sizeBeforeAddChar == longestSubString.size()) {
                second = first;
                length = length < sizeAfterAddChar ? sizeAfterAddChar : length;
                longestSubString.clear();
                first++;
            } else {
                second++;
            }
        }
        return length < sizeAfterAddChar ? sizeAfterAddChar : length;
    }
}
// if (s.length() == 0) return 0;
// char[] myChars = s.toCharArray();
//
// int sizeBeforeAddChar = 0;
// longestSubString.add(myChars[0]);
// int length = 1;

// for (int i = 1; i < myChars.length; i++) {
// while (sizeBeforeAddChar != longestSubString.size() && i < myChars.length) {
// sizeBeforeAddChar = longestSubString.size();
// longestSubString.add(myChars[i]);
// i++;
// }
// System.out.println(longestSubString.toString());
// length = length < longestSubString.size() ? longestSubString.size() : length;
// longestSubString.clear();
// i--;
// sizeBeforeAddChar = 0;
// longestSubString.add(myChars[i]);
// }

// return length;