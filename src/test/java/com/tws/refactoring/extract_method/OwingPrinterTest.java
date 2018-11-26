package com.tws.refactoring.extract_method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OwingPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void printBanner() {
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printBannaer();
        assertEquals("*****************************\r\n" + "****** Customer totals ******\r\n" + "*****************************\r\n", outContent.toString());
    }

    @Test
    public void calculateOutstanding() {
        OwingPrinter owingPrinter = new OwingPrinter();
    }

    @Test
    public void printDetails() {
        OwingPrinter owingPrinter = new OwingPrinter();
        owingPrinter.printDetails("ABC", 123.0);
        assertEquals("name: ABC\r\n" + "amount: 123.0\r\n", outContent.toString());
    }
}