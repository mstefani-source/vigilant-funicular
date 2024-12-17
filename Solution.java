import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Solution {

    public static String reverseWords(String s) {

        String regex = "[\\s+]";
        String[] myArray = s.split(regex);
        ArrayList<String> revArray = new ArrayList<>();
        List<String> words = Arrays.asList(myArray);

        Consumer<List<String>> trimConsumer = list -> {
            for (int x = 0; x < list.size() - 1; x++) {
                list.set(x, list.get(x).trim());
            }
        };

        Consumer<List<String>> fillupConsumer = list -> {
            for (int x = list.size() - 1; x >= 0; x--) {
                if (!list.get(x).isBlank()) {
                    revArray.add(list.get(x));
                }
            }
        };

        trimConsumer.andThen(fillupConsumer).accept(words);
        return String.join(" ", revArray);
    }

    public static void main(String[] args) {

        String myStr = "I love cats. Cats are very easy to love. Cats are very popular.";
        String regex = "(?i)cat";
        System.out.println(myStr.replaceAll(regex, "dog"));
        System.out.print(reverseWords("  end of the day  "));
    }
}