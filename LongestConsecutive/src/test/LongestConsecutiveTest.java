package test;

import main.LongestConsecutive;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveTest {

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas",
                "theta",
                "abigail"}, 2), "abigailtheta");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx",
                "dqqqaaabbb",
                "oocccffuucccjjjkkkjyyyeehh"}, 1), "oocccffuucccjjjkkkjyyyeehh");
        assertEquals(LongestConsecutive.longestConsec(new String[]{}, 3), "");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"itvayloxrp", "wkppqsztdkmvcuwvereiupccauycnjutlv",
                        "vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2),
                "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu",
                        "wpgozvxxiu"}
                , 2), "wlwsasphmxxowiaxujylentrklctozmymu");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas"}
                        , -2)
                , "");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"}, 3),
                "ixoyx3452zzzzzzzzzzzz");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
                15), "");
        assertEquals(LongestConsecutive.longestConsec(new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
                0), "");
    }

}

