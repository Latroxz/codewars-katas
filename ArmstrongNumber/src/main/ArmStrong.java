package main;

public class ArmStrong {
    public static boolean isNarcissistic(int number) {
        int length = Integer.toString(number).length();
        int sum =
                Integer.toString(number).chars().map(Character::getNumericValue).map(n -> (int) Math.pow(n, length)).sum();
        return number == sum;
    }

    public static void main(String[] args) {
        System.out.println("Is it narcissistic? " + isNarcissistic(153));
    }

}
