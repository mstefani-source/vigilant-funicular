package lkapp.Solutions.reversewordsinastring;

import java.util.ArrayList;

public class ReverseWordsArray {

    public String reverseWords(String s) {

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

}