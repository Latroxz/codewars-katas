package test;

import main.ArrayDifference;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayDifferenceTest {
    @Test
    public void shouldReturnTheArrayDifferenceRemovedFromIt() {
        assertArrayEquals(new int[]{2}, ArrayDifference.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, ArrayDifference.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, ArrayDifference.arrayDiff(new int[]{}, new int[]{1, 2}));
    }

}
