package test;

import main.Pangram;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PangramTest {
    @Test
    public void shouldReturnTrueIfSentenceUsesAllLettersInAlphabet() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        assertEquals(true, Pangram.isPangram(pangram1));
    }

    @Test
    public void shouldReturnFalseIfSentenceDoesNotUseAllLettersInAlphabet() {
        String pangram2 = "You shall not pass!";
        assertEquals(false, Pangram.isPangram(pangram2));
    }

}
