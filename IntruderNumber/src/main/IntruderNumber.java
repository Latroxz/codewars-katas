package main;

import java.util.Arrays;

public class IntruderNumber {
    public static int find(int[] numbers) {
        return getIntruder(numbers);
    }

    /*
     * This method is based on the premise that there will be 1 AND only 1 even or odd
     * so it stores that value in the odd or even and at the end it compares if odd length is 1
     * then it found that the intruder is odd, if not, returns the intruder that is even stored in the even array
     */
    public static int findElegant(int[] integers) {
        int[] odd = Arrays.stream(integers).filter(n -> n % 2 != 0).toArray();
        int[] even = Arrays.stream(integers).filter(n -> n % 2 == 0).toArray();
        return odd.length == 1 ? odd[0] : even[0];
    }

    private static int getIntruder(int[] numbers) {
        boolean isMajorityEven = getIfIsMajorityEven(numbers);
        for (int number : numbers) {
            if ((number % 2 == 0) != isMajorityEven) {
                return number;
            }
        }
        return 0;
    }

    private static boolean getIfIsMajorityEven(int[] numbers) {
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        boolean isMajorityEven = evenCount > numbers.length / 2;
        return isMajorityEven;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        int[] numbers2 = {-78, 1, 3, 5};
        System.out.println(find(numbers2));
    }

}
