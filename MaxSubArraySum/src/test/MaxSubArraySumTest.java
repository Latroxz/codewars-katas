package test;

import main.MaxSubArraySum;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSubArraySumTest {
    @Test
    @DisplayName("Empty arrays should have a max of 0")
    public void shouldReturn0WhenArrayIsEmpty() throws Exception {
        assertEquals(0, MaxSubArraySum.sequence(new int[]{}));
    }

    @Test
    @DisplayName("Example array should have a max of 6")
    public void shouldReturnMaxSubArraySum() throws Exception {
        assertEquals(6, MaxSubArraySum.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    @DisplayName("Should return 0 when array result is negative")
    public void shouldReturnZeroWhenSubArraySumIsNegative() throws Exception {
        assertEquals(0, MaxSubArraySum.sequence(new int[]{-4, -7, -1, -8, -5}));
    }

}
