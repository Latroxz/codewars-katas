package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static main.ArmStrong.isNarcissistic;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArmStrongTest {
    @Test
    @DisplayName("It should return true for the first 10 (excluding 0-9) narcissistic numbers")
    public void shouldReturnTrueWhenNumberIsNarcissistic() {
        assertTrue(isNarcissistic(153));
        assertTrue(isNarcissistic(370));
        assertTrue(isNarcissistic(371));
        assertTrue(isNarcissistic(407));
        assertTrue(isNarcissistic(1634));
        assertTrue(isNarcissistic(8208));
        assertTrue(isNarcissistic(9474));
        assertTrue(isNarcissistic(54748));
        assertTrue(isNarcissistic(92727));
        assertTrue(isNarcissistic(93084));
    }

    @Test
    @DisplayName("It should return true for the first 10 (excluding 0-9) narcissistic numbers")
    public void shouldReturnFalseWhenNumberIsNotNarcissistic() {
        assertFalse(isNarcissistic(10));
        assertFalse(isNarcissistic(100));
        assertFalse(isNarcissistic(9475));
    }

}
