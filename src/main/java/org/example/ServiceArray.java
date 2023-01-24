package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class ServiceArray {
    public static double arrayMean(int[] arry) {
        if (arry != null) {
            OptionalDouble number = Arrays.stream(arry).average();
            number.orElse(0.0);
            return number.orElse(0.0);
        }
        return 0.0;
    }

    public static String getMinElementAndNumber(int[] arry) {
        String rezult = "Array is empty or does not exist";
        if (arry != null) {
            OptionalInt minElement = Arrays.stream(arry).min();
            int min = minElement.orElse(Integer.MIN_VALUE);
            if (!minElement.equals(Integer.MIN_VALUE)) {
                int index1 = Arrays.stream(arry).boxed().collect(Collectors.toList()).indexOf(min);
                rezult = "The minimum element of the array min number " + min + "  of the minimum element " + index1;
            }
        }
        return rezult;
    }

    public static long countingZeroElements(int[] arry) {
        if (arry != null) {
            return Arrays.stream(arry).filter(x -> x == 0).count();
        }
        return 0;
    }

    public static long countingElementsNotEqualToZero(int[] arry) {
        if (arry != null) {
            return Arrays.stream(arry).filter(x -> x > 0).count();
        }return -1L;
    }

    public static Object[] multiplyEachElementByNumber(int[] arry, int number) {
        if (arry != null) {
            return Arrays.stream(arry).map(x -> x = x * number).boxed().collect(Collectors.toList()).toArray();
        }return null;
    }
}
