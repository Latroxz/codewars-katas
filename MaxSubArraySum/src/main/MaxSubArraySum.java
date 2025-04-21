package main;

public class MaxSubArraySum {

    //Kadane Algorithm is optimal with O(n) time and O(1) space complexity
    //outperforming brute-force methods with O(n²)(using for cycles to sum every sub array) time complexity.
    public static int sequence(int[] numbers) {
        if (numbers.length == 0) return 0;
        int actualMax = numbers[0];
        int globalMax = actualMax;

        for (int i = 1; i < numbers.length; i++) {
            actualMax = Math.max(numbers[i], actualMax + numbers[i]);
            if (globalMax < actualMax) {
                globalMax = actualMax;
            }
        }
        return Math.max(globalMax, 0);
    }

}
