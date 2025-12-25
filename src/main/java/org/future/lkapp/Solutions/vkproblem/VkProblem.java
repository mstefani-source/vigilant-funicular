package org.future.lkapp.Solutions.vkproblem;

import java.util.ArrayList;
import java.util.List;

public class VkProblem {

    public String convertUrl(String url) {

        char[] urlarr = url.toCharArray();

        String hey = "hey";

        System.out.println(hey.concat(new String("hey")));

        // {'H','e','l','l','o',' ','J','a','v','a',' ',' '}

        List<Integer> evidence = new ArrayList();

        // calculate a number of spaces
        int numberOfWords = 0;
        int numberOfSpaces = 0;
        boolean ivemetspace = true;
        boolean inWord = false;

        for (int i = urlarr.length - 1; i >= 0; i--) {
            if (ivemetspace && urlarr[i] == ' ') {
                numberOfSpaces++;
            } else {
                ivemetspace = false;
            }
        }

        for (int i = 0; i < urlarr.length; i++) {

            if (urlarr[i] != ' ') {
                if (!inWord) {
                    inWord = true;
                    numberOfWords++;
                }

            } else {
                inWord = false;
            }
        }

        // check if numspace even

        if ((numberOfSpaces & 1) != 0 || numberOfSpaces / 2 < numberOfWords - 1) {
            throw new RuntimeException("no space for transform");
        }

        System.out.println("number space " + numberOfSpaces);
        System.out.println("number of word " + numberOfWords);

        return new String(urlarr);

    }

}
