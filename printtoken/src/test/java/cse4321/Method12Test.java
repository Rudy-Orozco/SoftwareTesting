// Aiden Sparks
package cse4321;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class Method12Test {
    @Test
    void testNumFalse_char() throws Exception{
        boolean test1 = Printtokens.is_num_constant("a");
        assertFalse(test1);
    }

    @Test
    void testNumFalse_numchar() throws Exception{
        boolean test2 = Printtokens.is_num_constant("5t");
        assertFalse(test2);
    }

    @Test
    void testNumFalse_2numchar() throws Exception{
        boolean test3 = Printtokens.is_num_constant("54y");
        assertFalse(test3);
    }

    @Test
    void testNumtrue_doubleDigit() throws Exception{
        boolean test4 = Printtokens.is_num_constant("12");
        assertTrue(test4);
    }

    @Test
    void testNumTrue_singleDigit() throws Exception{
        boolean test5 = Printtokens.is_num_constant("1");
        assertTrue(test5);
    }
}
