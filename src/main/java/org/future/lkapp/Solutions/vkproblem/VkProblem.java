package org.future.lkapp.Solutions.vkproblem;

import java.util.Arrays;

/*
    url = "Hello Java!  "

    validUrl = "Hello%20Java!"
*/

public class VkProblem {

    public static String main(String[] args) {

        char[] urlarr = args[0].toCharArray();

        char last = '0'; 
        char first = '2'; 
        char temp = ' ';
        boolean met_space = false;

        for (int i = 0; i < urlarr.length; i++) {
            if (met_space == true) {
                temp = urlarr[i];
                urlarr[i] = first;
                first = last;
                last = temp; 
            }
            
            if (urlarr[i] == ' ') {
                met_space = true;
                urlarr[i] ='%';
            }
        }

        return new String(urlarr);
    }
}
