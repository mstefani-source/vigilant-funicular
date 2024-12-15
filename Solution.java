import java.util.ArrayList;

class Solution {

    public String reverseWords(String s) {

        String regex = "[\\s]";
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

        Solution sol = new Solution();

        System.out.println(sol.reverseWords(" Hello   World "));
        System.out.println(sol.reverseWords("Plan B"));
        System.out.println(sol.reverseWords("the sky is blue"));
    }
}