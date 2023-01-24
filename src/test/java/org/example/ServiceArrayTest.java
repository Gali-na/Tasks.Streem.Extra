package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceArrayTest {

    @Test
    void arrayMean_ArrayIsNotEmpty_GetPositiveRezult() {
        int[] arrOne = new int[]{1, 1, 1};
        int[] arrTwo = new int[]{2, 2, 2};
        assertEquals(1, ServiceArray.arrayMean(arrOne));
        assertEquals(2, ServiceArray.arrayMean(arrTwo));
    }

    @Test
    void arrayMean_ArrayIsEmpty_Get0() {
        int[] arrOne = new int[]{};
        assertEquals(0, ServiceArray.arrayMean(arrOne));
    }

    @Test
    void arrayMean_ArrayIsNull_Get0() {
        int[] arrOne = null;
        assertEquals(0, ServiceArray.arrayMean(arrOne));
    }
    @Test
    void getMinElementAndNumber_ArrayIsNull_GetErrorMessage() {
        int[] arrOne = null;
        String rezult = "Array is empty or does not exist";
        assertEquals(rezult,ServiceArray.getMinElementAndNumber(arrOne));
    }

    @Test
    void getMinElementAndNumber_ArrayIsEmpty_GetErrorMessage() {
        int[] arrOne = null;
        String rezult = "Array is empty or does not exist";
        assertEquals(rezult,ServiceArray.getMinElementAndNumber(arrOne));
    }

    @Test
    void getMinElementAndNumber_FilledArray_GetRezultMessage() {
        int[] arrOne = new int[]{1, 2, 3,4,5,6,7,8};
        String rezult = "The minimum element of the array min number " + 1 + "  of the minimum element " + 0;
        assertEquals(rezult,ServiceArray.getMinElementAndNumber(arrOne));
    }
    @Test
    void countingZeroElements_ArrayIsNull_Get0() {
        int[] arrOne = null;
        assertEquals(0,ServiceArray.countingZeroElements(arrOne));
    }

    @Test
    void countingZeroElements_ArrayIsEmpty_GetError0() {
        int[] arrOne = new int[]{};
        assertEquals(0,ServiceArray.countingZeroElements(arrOne));
    }

    @Test
    void countingZeroElements_FilledArray_GetCount0() {
        int[] arrOne = new int[]{1, 2, 3,4,5,6,7,8,0,0};
        assertEquals(2,ServiceArray.countingZeroElements(arrOne));
    }

    @Test
    void countingElementsNotEqualToZero_ArrayIsNull_GetNegativeNumber() {
        int[] arrOne = null;
        assertEquals(-1,ServiceArray.countingElementsNotEqualToZero(arrOne));
    }

    @Test
    void countingElementsNotEqualToZero_FilledArray_GetСountElementIsNotZero() {
        int[] arrOne = new int[]{1, 2, 3,4,5,6,7,8,0,0};
        assertEquals(8,ServiceArray.countingElementsNotEqualToZero(arrOne));
    }

    @Test
    void countingElementsNotEqualToZerovoid_ArrayIsEmty_GetNegativeNumber() {
        int[] arrOne = new int[]{};
        assertEquals(0,ServiceArray.countingElementsNotEqualToZero(arrOne));
    }


    @Test
    void multiplyEachElementByNumber_ArrayIsNull_GetNull() {
        int[] arrOne = null;
        assertEquals(null,ServiceArray.multiplyEachElementByNumber(arrOne,1));
    }

    @Test
    void multiplyEachElementByNumber_ArrayIsEmty_GetNull() {
        Object[] arrOne = new Object[]{2, 4, 6,8,10,12,14,16};
        int[] arrTwo = new int[]{1, 2, 3,4,5,6,7,8};
        assertEquals(arrOne[0],ServiceArray.multiplyEachElementByNumber(arrTwo,2)[0]);
        assertEquals(arrOne[1],ServiceArray.multiplyEachElementByNumber(arrTwo,2)[1]);
        assertEquals(arrOne[2],ServiceArray.multiplyEachElementByNumber(arrTwo,2)[2]);
        assertEquals(arrOne[3],ServiceArray.multiplyEachElementByNumber(arrTwo,2)[3]);
    }

    @Test
    void multiplyEachElementByNumber_FilledArray_GetArrayElementsMultipliedMethodArgument() {
        int[] arrOne = new int[]{};
        assertEquals(0,ServiceArray.multiplyEachElementByNumber(arrOne,1).length);
    }
}