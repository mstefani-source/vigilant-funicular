package org.future.lkapp.Solutions.vkproblem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("A special test class")
public class VkProblemTest {
    @Test
    @DisplayName("A oneSpaceTest case")
    public void oneSpaceTest() {
        String[] values = { "Hello Java!  " };
        String result = VkProblem.main(values);

        assertEquals("Hello%20Java!", result);
    }
}
