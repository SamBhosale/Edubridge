package com.junit;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class TestStringBuffer {

    @Test
    public void test() {
    	StringBuffer sb= new StringBuffer();
        StringBuffer sbOne = new StringBuffer("Sam");
        StringBuffer sbTwo = new StringBuffer("bhosale");
        boolean str = sb.function(sbOne, sbTwo);
        assertEquals(true, str);
    }

}

