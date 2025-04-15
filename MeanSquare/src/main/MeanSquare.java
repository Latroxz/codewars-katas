package main;

import java.util.stream.IntStream;

public class MeanSquare {
    public static double solution(int[] arrA, int[] arrB) {
        double mean = 0d;
        for (int i = 0; i < arrA.length; i++) {
            mean += Math.pow(arrA[i] - arrB[i], 2);
        }
        mean /= arrA.length;
        return mean;
    }

    public static double solutionStreams(int[] arrA, int[] arrB) {

        return IntStream.range(0, arrA.length)
                .mapToDouble(index -> Math.pow(arrA[index] - arrB[index], 2))
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {4, 5, 6};
        System.out.println(solution(a1, a2));
        System.out.println(solutionStreams(a1, a2));
    }

}
