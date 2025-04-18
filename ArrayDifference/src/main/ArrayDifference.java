package main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayDifference {
    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1)
                .filter(element -> !Arrays.stream(arr2)
                        .boxed()
                        .collect(Collectors.toSet())
                        .contains(element))
                .toArray();
    }

}
