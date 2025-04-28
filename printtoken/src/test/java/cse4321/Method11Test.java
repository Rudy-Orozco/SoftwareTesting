// Aiden Sparks
package cse4321;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Method11Test {
    
    @Test
    void testCharTrue() throws Exception{
        boolean test1 = Printtokens.is_char_constant("a");
        assertTrue(test1);
    }

    @Test
    void testCharFalse() throws Exception{
        boolean test2 = Printtokens.is_char_constant("hello");
        assertFalse(test2);
    }
}
