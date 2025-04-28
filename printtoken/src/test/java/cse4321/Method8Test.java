// Rudy Orozco
package cse4321;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Method8Test {
    Printtokens pt = new Printtokens();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testPrintOutput() {
        pt.print_token(" ");
        assertEquals("error,\" \".\n", outContent.toString());
    }

    @Test
    void testPrintOutput2() {
        pt.print_token("and");
        assertEquals("keyword,\"and\".\n", outContent.toString());
    }

    @Test
    void testPrintOutput3() {
        pt.print_token("(");
        assertEquals("lparen.\n", outContent.toString());
    }

    @Test
    void testPrintOutput4() {
        pt.print_token("a1");
        assertEquals("identifier,\"a1\".\n", outContent.toString());
    }

    @Test
    void testPrintOutput5() {
        pt.print_token("123");
        assertEquals("numeric,\"123\".\n", outContent.toString());
    }

    @Test
    void testPrintOutput6() {
        pt.print_token("\"asdf\"");
        assertEquals("string,\"\"asdf\"\".\n", outContent.toString());
    }
    
    @Test
    void testPrintOutput7() {
        pt.print_token("#a");
        assertEquals("character,\"#a\".\n", outContent.toString());
    }

    @Test
    void testPrintOutput8() {
        pt.print_token(";aaaa");
        assertEquals("comment,\";aaaa\".\n", outContent.toString());
    }
}
