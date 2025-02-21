package org.future.lkapp;

import java.util.HashMap;
import java.util.Map;

import org.future.lkapp.Solutions.atoi.MyInteger;
import org.future.lkapp.Solutions.lengthoflongestsubstring.LongestSubString;
import org.future.lkapp.Solutions.lpc.Lpc;
import org.future.lkapp.Solutions.lps.LongestPalindromicSubstring;
import org.future.lkapp.Solutions.palindrome.Palindrome;
import org.future.lkapp.Solutions.revint.Solution7;
import org.future.lkapp.Solutions.zigzag.ZigZag;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@DisplayName("A special test case")
@TestMethodOrder(OrderAnnotation.class)
public class LkTests {

    @Test
    @Order(1)
    @DisplayName("LPS")
    public void longestPalindrome() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String tesString = "vnjwvalrbypfcbqnmopltjnoifmzwgvpzqzsdtvawndpjtpmpjbjionjifqtvvocpeaftvhpdgjjfafunfndztdjkcxyihtsyppendfzzjeyxlbwpdygiqmdqcdbmgyjigrmfkswcwryaydjilqqxvcnyvviesuncslvzikawwqykqwdfibggezufqihcjkebapmgkvwixywgdextafxycnipjglsndkyjoqfyfljfkkvoieksmavdlmlhhnstesibffiopqvlyuidvrawndbzonwzbsjmpeqoglmdbinkovqpzfkxihzitdopnomseqhmrrkcsvrzziphwpuhjngeotwcrebcmbtirkgeavojtmpakcewmexhxacngknokxsvtqobdgckutpexswgwqzbosjpxauyflnylfcxsucsehqvakbpvfmkelmkspsqxnutwfwacpqqvovdqafeylobneojdsgqowcbxfsvuqusdbylcgcvgrofgvzubakjmlbffjhrafvnqttwuyhokzpmhlludpbowuxzrebxsdusalljfjgjkucwzpmndqncykvfnbrxcrcaxwisjpstejjqbpwegpxyrtyafxklgralnkwxkmjpuqfixzkonznmguyizlancpxdzcfkgiotyelegprbaytdhbutbuihkxnbtuqrtezaskfqsmrznfohhlqp";
        assertTrue("zqz".equals(lps.longestPalindromeRec(tesString)), "zgz should equal zgz");
    }

    @Test
    @Order(2)
    @DisplayName("LPC")
    public void longestCommonPrefixTest() {
        Lpc lpc = new Lpc();
        String[] testCase = { "flower", "flow", "flight" };
        assertTrue("fl".equals(lpc.longestCommonPrefix(testCase)));
    }

    @Test
    @Order(3)
    @DisplayName("Palindrome")
    public void palindromeTest() {
        Palindrome palindrome = new Palindrome();
        assertTrue(palindrome.isPalindrome("abba"));
    }

    @Test
    @Order(4)
    @DisplayName("LongestSubString")
    public void longestSubStringTest() {
        LongestSubString str = new LongestSubString();
        assertEquals(3, str.lengthOfLongestSubstring("abcabcbb"), "OOOOK");
    }

    @Test
    @Order(5)
    @DisplayName("ZigZag")
    public void zigzagTest() {
        ZigZag zigZag = new ZigZag();
        Map<String, String[]> testCase = new HashMap<>();
        testCase.put("PAHNAPLSIIGYIR", new String[] { "3", "PAYPALISHIRING" });
        testCase.put("PINALSIGYAHRPI", new String[] { "4", "PAYPALISHIRING" });
        testCase.put("PYAP", new String[] { "2", "PAYP" });
        testCase.put("PYA", new String[] { "2", "PAY" });
        testCase.put("PYAAPL", new String[] { "2", "PAYPAL" });
        testCase.put("PAAPLY", new String[] { "3", "PAYPAL" });

        for (Map.Entry<String, String[]> entry : testCase.entrySet()) {
            assertTrue(entry.getKey().equals(zigZag.convert(entry.getValue()[1], Integer.parseInt(entry.getValue()[0]))));
        }
    }

    @Test
    @Order(6)
    @DisplayName("atoi")
    public void itoaTest(){
        MyInteger myInteger = new MyInteger();
        assertTrue(myInteger.atoi("-1234") == -1234);
        assertTrue(myInteger.atoi("1337c0d3") == 1337);
        assertTrue(myInteger.atoi("0-1") == 0);
        assertTrue(myInteger.atoi("   -042") == -42);
    }

    @Test
    @Order(7)
    @DisplayName("reverseInt")
    public void reverseIntTest(){
        Solution7 myInteger = new Solution7();
        assertTrue(myInteger.reverse(123) == 321);
        assertTrue(myInteger.reverse(-123) == -321);
        assertTrue(myInteger.reverse(120) == 21);
        // assertTrue(myInteger.reverse(123) == 321);
        // assertTrue(myInteger.reverse(123) == 321);
    }

    @Test
    @Order(8)
    @DisplayName("Longest Palindrome Substring")
    public void lpcTest(){
        Lpc lpc = new Lpc();
        String[] strs = {"fly", "flis", "flo"};
        String[] oneLetter = {"a"};
        String[] noPrefix = {"fly", "flis", "hlo"};
        String[] differentLen = {"fly", "flis", "flo", "fl"};
        String[] empty = {""};
        String[] ab = {"ab", "a"};

        assertTrue(lpc.longestCommonPrefix(strs).equals("fl"));
        assertTrue(lpc.longestCommonPrefix(oneLetter).equals("a"));
        assertTrue(lpc.longestCommonPrefix(noPrefix).equals(""));
        assertTrue(lpc.longestCommonPrefix(differentLen).equals("fl"));
        assertTrue(lpc.longestCommonPrefix(empty).equals(""));
        assertTrue(lpc.longestCommonPrefix(ab).equals("a"));
    }
}
