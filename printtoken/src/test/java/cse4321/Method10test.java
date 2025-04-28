// Aiden Sparks
package cse4321;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class Method10test {


    @Test
    void testCommentTrue() throws Exception{
        boolean test1 = Printtokens.is_keyword("and");
        assertTrue(test1);
    }

    @Test
    void testCommentFalse() throws Exception{
        boolean test2 = Printtokens.is_keyword("hello");
        assertFalse(test2);
    }
}
