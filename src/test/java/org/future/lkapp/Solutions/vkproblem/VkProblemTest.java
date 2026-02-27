package org.future.lkapp.Solutions.vkproblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VkProblemTest {
    
    @Test
    public void compilrtest() {
        VkProblem testProblem = new VkProblem();

        String testString = "Java test";

        assertEquals(testString, testProblem.convertUrl(testString));
    }

}
