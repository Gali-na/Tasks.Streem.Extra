package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class –°reaterArrayTest {
    @Test
    void creat_CheckingNumberElements_GetPositiveRezult() {

        assertEquals(100, –°reaterArray.creat().length);
    }

    @Test
    void creat_CheckingNumberElements_NegativePositiveRezult() {

        assertNotEquals(0, –°reaterArray.creat().length);
    }
}