package main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String sentence) {
        return Arrays.stream(sentence.trim()
                        .split(" "))
                .map(word -> word.matches("\\p{Punct}") ? word : word.substring(1) + word.charAt(0) + "ay")
                .collect(Collectors.joining(" "));
    }

    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool"));
    }

}
