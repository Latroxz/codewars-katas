package test;

import main.SquareArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareArrayTest {


    @Test
    @DisplayName("Should return true if the second array is the square of the first")
    public void shouldReturnTrueIfSecondArrayIsSquaredOfFirst() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, SquareArray.comp(a, b));
    }

    @Test
    public void shouldReturnTrueIfSecondArrayIsSquaredOfFirstUsingStreams() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        assertEquals(true, SquareArray.compStreams(a, b));

    }

    @Test
    @DisplayName("Should return false if the second array isnt the square of the first")
    public void shouldReturnFalseIfSecondArrayIsNotSquaredOfFirst() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};
        assertEquals(false, SquareArray.comp(a, c));

    }

    @Test
    public void shouldReturnFalseIfSecondArrayIsNotSquaredOfFirstUsingStreams() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};
        assertEquals(false, SquareArray.compStreams(a, c));

    }

    @Test
    @DisplayName("Should return false if the second array isnt the same length of the first")
    public void shouldReturnFalseIfSecondArrayIsNotTheSameLength() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};
        assertEquals(false, SquareArray.comp(a, new int[]{1, 2, 3}));
        assertEquals(false, SquareArray.comp(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnFalseIfSecondArrayIsNotTheSameLengthUsingStreams() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};
        assertEquals(false, SquareArray.compStreams(a, new int[]{1, 2, 3}));
        assertEquals(false, SquareArray.compStreams(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));
    }

    @Test
    @DisplayName("Should return false if the second array isnt the same length of the first")
    public void shouldReturnFalseIfArrayIsNull() {
        assertEquals(false, SquareArray.comp(null, new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnFalseIfArrayIsNullUsingStreams() {
        assertEquals(false, SquareArray.compStreams(null, new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnTrueIfArraysAreEmpty() {
        assertEquals(true, SquareArray.comp(new int[]{}, new int[]{}));
    }

    @Test
    public void shouldReturnTrueIfArraysAreEmptyUsingStreams() {
        assertEquals(true, SquareArray.compStreams(new int[]{}, new int[]{}));
    }

}
