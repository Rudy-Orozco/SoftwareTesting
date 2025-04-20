import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method7Test {
    Printtokens pt = new Printtokens();
    static int error = 0;
	static int keyword = 1;
	static int spec_symbol = 2;
	static int identifier = 3;
	static int num_constant = 41;
	static int str_constant = 42;
	static int char_constant = 43;
	static int comment = 5;
    
    @Test
    void tokenTypeTest1() throws Exception { // keyword
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "and";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(keyword,b);
    }

    @Test
    void tokenTypeTest2() throws Exception { // specSymbol
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "(";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(spec_symbol,b);
    }

    @Test
    void tokenTypeTest3() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "j";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(identifier,b);
    }

    @Test
    void tokenTypeTest4() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "21";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(num_constant,b);
    }

    @Test
    void tokenTypeTest5() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "\"hello\"";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(str_constant,b);
    }

    @Test
    void tokenTypeTest6() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "#a";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(char_constant,b);
    }

    @Test
    void tokenTypeTest7() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = ";comment";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(comment,b);
    }

    @Test
    void tokenTypeTest8() throws Exception { // identifier
        Method method = Printtokens.class.getDeclaredMethod("token_type", String.class);
        method.setAccessible(true);

        String str = "\n";

        Integer b = (Integer) method.invoke(pt, str);
        assertEquals(error,b);
    }

}
