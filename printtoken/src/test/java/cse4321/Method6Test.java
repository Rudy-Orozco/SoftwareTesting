package cse4321;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method6Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void isTokenEndTest1() throws Exception { // EOF
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        Integer str_com_id = 0;
        Integer res = -1;

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest2() throws Exception { // if end of string with "
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 1;
        char res = '"';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest3() throws Exception { // if end of string with no valid char
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 1;
        char res = ' ';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertFalse(b);
    }

    @Test
    void isTokenEndTest4() throws Exception { // Comment with end
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 2;
        char res = '\n';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest5() throws Exception { // comment with no valid
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 2;
        char res = 'A';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertFalse(b);
    }

    @Test
    void isTokenEndTest6() throws Exception { // Special Char
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 0;
        char res = ')';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest7() throws Exception { // Special ;
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 0;
        char res = ';';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertTrue(b);
    }

    @Test
    void isTokenEndTest8() throws Exception { // Special ;
        Method method = Printtokens.class.getDeclaredMethod("is_token_end", int.class, int.class);
        method.setAccessible(true);

        int str_com_id = 0;
        char res = 'B';

        Boolean b = (Boolean) method.invoke(pt, str_com_id, res);
        assertFalse(b);
    }
}
