package test;

import main.SquareArray;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareArrayTest {
    int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
    int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
    int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};

    @Test
    @DisplayName("Should return true if the second array is the square of the first")
    public void shouldReturnTrueIfSecondArrayIsSquaredOfFirst() {

        assertEquals(true, SquareArray.comp(a, b));
    }

    @Test
    @DisplayName("Should return false if the second array isnt the square of the first")
    public void shouldReturnFalseIfSecondArrayIsNotSquaredOfFirst() {
        assertEquals(false, SquareArray.comp(a, c));
    }

    @Test
    @DisplayName("Should return false if the second array isnt the same length of the first")
    public void shouldReturnFalseIfSecondArrayIsNotTheSameLength() {
        assertEquals(false, SquareArray.comp(a, new int[]{1, 2, 3}));
        assertEquals(false, SquareArray.comp(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3}));

    }

    @Test
    @DisplayName("Should return false if the second array isnt the same length of the first")
    public void shouldReturnFalseIfArrayIsNull() {
        assertEquals(false, SquareArray.comp(null, new int[]{1, 2, 3}));
    }

    @Test
    public void shouldReturnTrueIfArraysAreEmpty() {
        assertEquals(true, SquareArray.comp(new int[]{}, new int[]{}));
    }

}
