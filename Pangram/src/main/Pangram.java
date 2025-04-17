package main;

public class Pangram {
    public static boolean isPangram(String sentence) {
        return sentence.toLowerCase()
                .trim()
                .chars()
                .filter(c -> c >= 'a' && c <= 'z')
                .distinct()
                .count() == 26;
    }

    public static void main(String[] args) {
        String sentence = "Am I a pangram?: ";
        System.out.println(sentence + isPangram(sentence));
    }

}
