package main;

public class WalkCartasia {
    public static boolean isValid(char[] coordinates) {
        if (coordinates.length != 10) return false;
        int x = 0;
        int y = 0;
        for (char coordinate : coordinates) {
            switch (coordinate) {
                case 'n' -> y++;
                case 's' -> y--;
                case 'e' -> x++;
                case 'w' -> x--;
                default -> {
                    return false;
                }
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        char[] coordinates = new char[]{'n', 's', 'n', 's', 'e', 'w', 'e', 'w', 'n', 's'};
        System.out.println(isValid(coordinates));
    }

}
