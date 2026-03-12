package org.future.lkapp.Solutions.vkproblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.future.lkapp.Solutions.vproblem.VkProblem;
import org.junit.jupiter.api.Test;

public class VkProblemTest {
    
    @Test
    public void compilrtest() {
        VkProblem testProblem = new VkProblem();

        String testString = "Java test  ";
        String expectedString = "Java%20test";
        assertEquals(expectedString, testProblem.convertUrl(testString));
    }

}
