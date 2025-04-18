package main;

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
    public static int duplicateCount(String word) {
        Map<Character, Integer> duplicated = new HashMap<>();
        for (char c : word.toLowerCase()
                .toCharArray()) {
            duplicated.put(c, duplicated.getOrDefault(c, 0) + 1);
        }
        return (int) (duplicated.values()
                .stream()
                .filter(count -> count > 1)
                .count());
    }

    public static void main(String[] args) {
        System.out.println("duplicate count: " + duplicateCount("Indivisibilitiesrr"));
    }

}
