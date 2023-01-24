package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class СreaterArrayTest {
    @Test
    void creat_CheckingNumberElements_GetPositiveRezult() {

        assertEquals(100, СreaterArray.creat().length);
    }

    @Test
    void creat_CheckingNumberElements_NegativePositiveRezult() {

        assertNotEquals(0, СreaterArray.creat().length);
    }
}