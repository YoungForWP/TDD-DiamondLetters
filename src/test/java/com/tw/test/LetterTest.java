package com.tw.test;

import com.tw.Letters;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterTest {

    private final Letters letters = new Letters();

    @Test
    public void test_when_input_is_A() throws Exception {
        assertEquals("A", letters.output('A'));
    }

    @Test
    public void test_when_input_is_B() throws Exception {
        assertEquals(" A\nB B\n A", letters.output('B'));
    }

    @Test
    public void test_when_input_is_C() throws Exception {
        assertEquals("  A\n B B\nC   C\n B B\n  A", letters.output('C'));
    }

    @Test
    public void test_when_input_is_D() throws Exception {
        assertEquals("   A\n  B B\n C   C\nD     D\n C   C\n  B B\n   A", letters.output('D'));
    }

}


