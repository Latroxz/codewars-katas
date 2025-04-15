package test;

import main.MeanSquare;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeanSquareTest {
    @Test
    @DisplayName("It should return the mean squared difference between 2 matrix")
    public void shouldReturnTheMeanDifferenceSquare() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        assertEquals(9, MeanSquare.solution(a1, a2));

        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};

        assertEquals(16.5, MeanSquare.solution(b1, b2));

        int[] c1 = {0, -1};
        int[] c2 = {-1, 0};
        assertEquals(1.0, MeanSquare.solution(c1, c2));

        int[] d1 = {10, 10};
        int[] d2 = {10, 10};
        assertEquals(0.0, MeanSquare.solution(d1, d2));

    }

    @Test
    @DisplayName("It should return the mean squared difference between 2 matrix using streams")
    public void shouldReturnTheMeanDifferenceSquareUsingStreams() {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        assertEquals(9, MeanSquare.solutionStreams(a1, a2));

        int[] b1 = {10, 20, 10, 2};
        int[] b2 = {10, 25, 5, -2};

        assertEquals(16.5, MeanSquare.solutionStreams(b1, b2));

        int[] c1 = {0, -1};
        int[] c2 = {-1, 0};
        assertEquals(1.0, MeanSquare.solutionStreams(c1, c2));

        int[] d1 = {10, 10};
        int[] d2 = {10, 10};
        assertEquals(0.0, MeanSquare.solutionStreams(d1, d2));

    }

}
