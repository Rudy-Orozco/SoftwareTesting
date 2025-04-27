package cse4321;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class Method14Test {
    
    @Test
    void testIDFalse_num() throws Exception{
        boolean test1 = Printtokens.is_identifier("5");
        assertFalse(test1);
    }

    @Test
    void testIDTrue_char() throws Exception{
        boolean test2 = Printtokens.is_identifier("a");
        assertTrue(test2);
    }

    @Test
    void testIDFalse_charSpec() throws Exception{
        boolean test3 = Printtokens.is_identifier("a2!");
        assertFalse(test3);
    }

    @Test
    void testIDTrue_word() throws Exception{
        boolean test4 = Printtokens.is_identifier("yes");
        assertTrue(test4);
    }
}
