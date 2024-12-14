import java.util.ArrayList;

class Solution {

    public static String reverseWords(String s) {

        String regex = "[\\s+]";
        String[] myArray = s.split(regex);

        ArrayList<String> revArray = new ArrayList<>();
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (!"".equals(myArray[i])) {
                revArray.add(myArray[i]);
            }
        }
        return String.join(" ", revArray);
    }

    public static void main(String[] args) {

        System.out.println(reverseWords(" new era "));
        System.out.println(reverseWords(" Hello   World "));
        System.out.println(reverseWords("Plan B"));
        System.out.println(reverseWords("the sky is blue"));

    }
}