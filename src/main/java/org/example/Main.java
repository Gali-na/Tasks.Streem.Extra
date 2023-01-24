package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        СreaterArray creter = new СreaterArray();
        int[] arr = new int[]{1, 2, 3};
        System.out.println(ServiceArray.arrayMean(arr));
        System.out.println(ServiceArray.getMinElementAndNumber(arr));
        System.out.println(ServiceArray.countingElementsNotEqualToZero(arr));
        Object [] objects=ServiceArray.multiplyEachElementByNumber(arr,2);
        System.out.println(Arrays.toString(objects));
        System.out.println(ServiceArray.countingZeroElements(arr));
        System.out.println(ServiceArray.countingElementsNotEqualToZero(arr));
    }
}
