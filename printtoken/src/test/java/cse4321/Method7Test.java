package cse4321;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


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
        String str = "and";

        Integer b = pt.token_type(str);
        assertEquals(keyword,b);
    }

    @Test
    void tokenTypeTest2() throws Exception { // specSymbol

        String str = "(";

        Integer b = pt.token_type(str);
        assertEquals(spec_symbol,b);
    }

    @Test
    void tokenTypeTest3() throws Exception { // identifier

        String str = "j";

        Integer b = pt.token_type(str);
        assertEquals(identifier,b);
    }

    @Test
    void tokenTypeTest4() throws Exception { // identifier

        String str = "21";

        Integer b = pt.token_type(str);
        assertEquals(num_constant,b);
    }

    @Test
    void tokenTypeTest5() throws Exception { // identifier

        String str = "\"hello\"";

        Integer b = pt.token_type(str);
        assertEquals(str_constant,b);
    }

    @Test
    void tokenTypeTest6() throws Exception { // identifier
        String str = "#a";

        Integer b = pt.token_type(str);
        assertEquals(char_constant,b);
    }

    @Test
    void tokenTypeTest7() throws Exception { // identifier
        String str = ";comment";

        Integer b = pt.token_type(str);
        assertEquals(comment,b);
    }

    @Test
    void tokenTypeTest8() throws Exception { // identifier

        String str = "\n";

        Integer b = pt.token_type(str);
        assertEquals(error,b);
    }

}
