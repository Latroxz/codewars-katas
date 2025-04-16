package main;

public class WalkCartasia {
    public static boolean isValid(char[] coordinates) {
        return true;
    }

    public static void main(String[] args) {
        char[] coordinates = new char[]{'n', 's', 'n', 's', 'e', 'w', 'e', 'w', 'n', 's'};
        System.out.println(isValid(coordinates));
    }

}
