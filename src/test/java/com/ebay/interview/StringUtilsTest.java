package com.ebay.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void verifyForPositiveInput(){
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", 2), "yzabcdefghijklmnopqrstuvwx");
    }

    @Test
    public void verifyForNegativeInput(){
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", -2), "cdefghijklmnopqrstuvwxyzab");
    }

    @Test
    public void verifyForZeroInput(){
        assertEquals(StringUtils.shiftString("abcdefghijklmnopqrstuvwxyz", 0), "abcdefghijklmnopqrstuvwxyz");
    }

    //...
}