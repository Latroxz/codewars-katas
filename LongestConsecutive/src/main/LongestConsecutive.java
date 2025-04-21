package main;

import java.util.Arrays;

public class LongestConsecutive {
    public static String longestConsec(String[] words, int consecutive) {
        String longestConcatenated = "";
        String current;
        if (words.length == 0 || consecutive > words.length || consecutive <= 0) return "";

        //we can only get the elements (size - consecutive) to have enough space in array and not get exception
        // ArrayIndexOutOfBoundsException
        for (int i = 0; i <= words.length - consecutive; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < (i + consecutive); j++) {
                sb.append(words[j]);
            }
            current = sb.toString();
            if (current.length() > longestConcatenated.length()) {
                longestConcatenated = sb.toString();
            }
        }
        return longestConcatenated;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"tree", "foling", "trashy", "blue", "abcdef", "uvwxyz"};
        System.out.println(Arrays.toString(words));
        System.out.println("Longest consec: " + longestConsec(words, 2));
    }

}
