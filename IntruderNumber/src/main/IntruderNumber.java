package main;

public class IntruderNumber {
    public static int find(int[] numbers) {
        Integer firstPositions = intruderInFirstPositions(numbers);
        if (firstPositions != null) return firstPositions;
        return intruderInRemainingPositions(numbers);
    }

    private static int intruderInRemainingPositions(int[] numbers) {
        int evenCount = 0;
        int oddCount = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (evenCount > 1) {
                if (number % 2 != 0) return number;
            } else if (oddCount > 1) {
                if (number % 2 == 0) return number;
            }
        }
        return 0;
    }

    private static Integer intruderInFirstPositions(int[] numbers) {
        if (numbers.length > 2) {
            if ((numbers[0] % 2 == numbers[2] % 2) && numbers[1] % 2 != numbers[0] % 2) {
                return numbers[1];
            }
            if ((numbers[1] % 2 == numbers[2] % 2) && numbers[0] % 2 != numbers[1] % 2) {
                return numbers[0];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] numbers = new int[]{206847684, 1056521, 7, 17, 1901, 21104421, 7, 1, 35521, 1, 7781};
        System.out.println(find(numbers));
    }

}
