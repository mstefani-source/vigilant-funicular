
import java.io.ByteArrayInputStream;
import java.util.ArrayList;

class Solution {

    public String reverseWords(String s) {

        byte[] byteArray = s.getBytes();
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        ArrayList<String> revStringArray = new ArrayList<>();
        ArrayList<String> word = new ArrayList<>();
        int currentLetter = bais.read();

        while (currentLetter != -1) {
            if (currentLetter == 32 && !word.isEmpty()) {
                revStringArray.add(0, String.join("", word));
                word.clear();
            } else if (currentLetter != 32) {
                String strAsciiTab = Character.toString((char) currentLetter);
                word.add(strAsciiTab);
            }
            currentLetter = bais.read();
        } 
        if (!word.isEmpty()) revStringArray.add(0, String.join("", word));
        
        return String.join(" ", revStringArray);
    }

    public static void main(String[] args) {

        Solution sol = new Solution();

        System.out.println(sol.reverseWords(" Hello   World "));
        System.out.println(sol.reverseWords("Plan B"));
        System.out.println(sol.reverseWords("the sky is blue"));
    }
}