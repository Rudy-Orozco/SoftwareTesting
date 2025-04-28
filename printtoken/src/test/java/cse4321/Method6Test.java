// Rudy Orozco
package cse4321;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class Method6Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void isTokenEndTest1() throws Exception { // EOF

        Integer str_com_id = 0;
        Integer res = -1;

        Boolean b = pt.is_token_end(str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest2() throws Exception { // if end of string with "

        int str_com_id = 1;
        char res = '"';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest3() throws Exception { // if end of string with no valid char

        int str_com_id = 1;
        char res = ' ';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertFalse(b);
    }

    @Test
    void isTokenEndTest4() throws Exception { // Comment with end

        int str_com_id = 2;
        char res = '\n';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest5() throws Exception { // comment with no valid
        int str_com_id = 2;
        char res = 'A';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertFalse(b);
    }

    @Test
    void isTokenEndTest6() throws Exception { // Special Char

        int str_com_id = 0;
        char res = ')';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest7() throws Exception { // Special ;
        int str_com_id = 0;
        char res = ';';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest8() throws Exception { // Special ;

        int str_com_id = 0;
        char res = 'B';

        Boolean b = pt.is_token_end(str_com_id, res);
        assertFalse(b);
    }
}
