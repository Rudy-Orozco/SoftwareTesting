// Aiden Sparks
package cse4321;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Method15Test {
    PrintStream originalOut = System.out;
    


    @Test
    void testlparen() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol("(");
        String out1 = br.toString();
        assertTrue(out1.contains("lparen"));
    }

    @Test
    void testrparen() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol(")");
        String out2 = br.toString();
        assertTrue(out2.contains("rparen"));
    }

    @Test
    void testlsquare() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol("[");
        String out3 = br.toString();
        assertTrue(out3.contains("lsquare"));
    }

    @Test
    void testrsquare() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol("]");
        String out4 = br.toString();
        assertTrue(out4.contains("rsquare"));
    }

    @Test
    void testquote() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol("'");
        String out5 = br.toString();
        assertTrue(out5.contains("quote"));
    }

    @Test
    void testbquote() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol("`");
        String out6 = br.toString();
        assertTrue(out6.contains("bquote"));
    }

    @Test
    void testcomma() throws Exception{
        ByteArrayOutputStream br = new ByteArrayOutputStream();
        System.setOut(new PrintStream(br));

        Printtokens.print_spec_symbol(",");
        String out7 = br.toString();
        assertTrue(out7.contains("comma"));
    }

}
