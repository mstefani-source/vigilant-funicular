package org.future.lkapp.Solutions.vkproblem;


/*
    url = "Hello Java!  "
    validUrl = "Hello%20Java!"
*/

public class VkProblem {

    public String convertUrl(String url) {

        char[] urlarr = url.toCharArray();

        char firstLiter = '%';
        char secondLiter = '2'; 
        char lastLiter = '0'; 
        char temp = ' ';
        boolean met_space = false;

        for (int i = 0; i < urlarr.length; i++) {
            if (met_space == true) {
                temp = urlarr[i];
                urlarr[i] = secondLiter;
                secondLiter = lastLiter;
                lastLiter = temp; 
            }
            
            if (urlarr[i] == ' ') {
                met_space = true;
                urlarr[i] = firstLiter;
            }
        }

        return new String(urlarr);
    }
}
