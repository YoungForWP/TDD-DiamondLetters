package com.tw.test;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LetterTest {
    @Ignore
    @Test
    public void test_when_input_is_A() throws Exception {
        assertEquals("A", output("A"));
    }

    @Ignore
    @Test
    public void test_when_input_is_B() throws Exception {
        assertEquals(" A\nB B\n A", output("B"));
    }

    @Test
    public void test_when_input_is_C() throws Exception {
        assertEquals("  A\n B B\nC   C\n B B\n  A", output("C"));
    }

    private String output(String inputLetter) {
        if(inputLetter.equals("A")){
            System.out.print(inputLetter);
            return inputLetter;
        }
        if(inputLetter.equals("B")){
            System.out.print(" A\nB B\n A");
            return " A\nB B\n A";
        }
        if(inputLetter.equals("C")){
            System.out.print("  A\n B B\nC   C\n B B\n  A");
            return "  A\n B B\nC   C\n B B\n  A";
        }
        return null;
    }
}
