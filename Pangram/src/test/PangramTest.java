package test;

import main.Pangram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramTest {
    @Test
    public void shouldReturnTrueIfSentenceUsesAllLettersInAlphabet() {
        String pangram1 = "The quick brown fox jumps over the lazy dog22.";
        assertEquals(true, Pangram.isPangram(pangram1));
    }

    @Test
    public void shouldReturnFalseIfSentenceDoesNotUseAllLettersInAlphabet() {
        String pangram2 = "You shall not pass1!";
        assertEquals(false, Pangram.isPangram(pangram2));
    }

}
