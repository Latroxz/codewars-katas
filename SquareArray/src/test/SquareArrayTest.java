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
        int[] c = new int[]{131, 144, 19, 161, 19, 144, 19, 11};

        assertEquals(true, SquareArray.comp(a, b));
        assertEquals(false, SquareArray.comp(a, c));
    }

}
