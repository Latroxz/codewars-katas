package main;

import java.util.Arrays;
import java.util.Objects;

public class SquareArray {

    public static boolean comp(int[] a, int[] b) {
        if (Objects.isNull(a) || Objects.isNull(b) || (a.length != b.length)) return false;
        int[] numbersSqrt = getElementsSqrt(b);
        a = getArrayAbsoluteAndSorted(a);
        Arrays.sort(numbersSqrt);

        return Arrays.equals(a, b);
    }

    public static boolean compStreams(int[] a, int[] b) {
        return !Objects.isNull(a) && !Objects.isNull(b)
                && (a.length == b.length)
                && Arrays.equals(
                Arrays.stream(a).map(element -> element * element).sorted().peek(x -> System.out.println("a squared: "
                        + x)).toArray(),
                Arrays.stream(b).sorted().peek(x -> System.out.println("b sorted: " + x)).toArray()
        );
    }

    private static int[] getArrayAbsoluteAndSorted(int[] a) {
        return Arrays.stream(a).map(Math::abs).sorted().toArray();
    }

    private static int[] getElementsSqrt(int[] b) {
        for (int i = 0; i < b.length; i++) {
            b[i] = (int) Math.sqrt(b[i]);
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println("Are they Equal: " + comp(a, b));
    }

}
