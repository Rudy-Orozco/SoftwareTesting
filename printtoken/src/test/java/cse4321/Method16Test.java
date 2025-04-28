package cse4321;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


import org.junit.jupiter.api.Test;

public class Method16Test {
    
    @Test
    void testlparen() throws Exception{
        boolean out1 = Printtokens.is_spec_symbol('(');
        assertTrue(out1);
    }

    @Test
    void testrparen() throws Exception{
        boolean out2 = Printtokens.is_spec_symbol(')');
        assertTrue(out2);
    }

    @Test
    void testlsquare() throws Exception{
        boolean out3 = Printtokens.is_spec_symbol('[');
        assertTrue(out3);
    }

    @Test
    void testrsquare() throws Exception{
        boolean out4 = Printtokens.is_spec_symbol(']');
        assertTrue(out4);
    }

    @Test
    void testquote() throws Exception{
        boolean out5 = Printtokens.is_spec_symbol('\'');
        assertTrue(out5);
    }

    @Test
    void testbquote() throws Exception{
        boolean out6 = Printtokens.is_spec_symbol('`');
        assertTrue(out6);
    }

    @Test
    void testcomma() throws Exception{
        boolean out7 = Printtokens.is_spec_symbol(',');
        assertTrue(out7);
    }

    @Test
    void testfalse() throws Exception{
        boolean out8 = Printtokens.is_spec_symbol('!');
        assertFalse(out8);
    }

}
