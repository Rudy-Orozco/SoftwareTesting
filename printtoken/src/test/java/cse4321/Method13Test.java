package cse4321;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Method13Test {
    @Test
    void testStrTrue_empty() throws Exception{
        boolean test1 = Printtokens.is_str_constant("\"\"");
        assertTrue(test1);
    }

    @Test
    void testStrTrue_full() throws Exception{
        boolean test2 = Printtokens.is_str_constant("\"yes\"");
        assertTrue(test2);
    }

    @Test
    void testStrFalse() throws Exception{
        boolean test3 = Printtokens.is_str_constant("\"yes");
        assertFalse(test3);
    }

}
