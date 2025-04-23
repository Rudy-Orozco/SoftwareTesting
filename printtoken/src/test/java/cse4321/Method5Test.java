package cse4321;
import java.io.BufferedReader;
import java.io.StringReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method5Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void openCharStream1() throws Exception { // Normal Token
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("hello");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("hello", br1);
    }

    @Test
    void openCharStream2() throws Exception { // Null String
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals(null, br1);
    }

    @Test
    void openCharStream3() throws Exception { // Space
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("   there is space");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("there", br1);
    }

    @Test
    void openCharStream4() throws Exception { // Special Character and end
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("(");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("(", br1);
    }

    @Test
    void openCharStream5() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("\"hello me\"");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("\"hello me\"", br1);
    }

    @Test
    void openCharStream6() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("; this is a comment");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("; this is a comment", br1);
    }

    @Test
    void openCharStream7() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader(" \n\r ");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals(null, br1);
    }

    @Test
    void openCharStream8() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        StringReader stringReader = new StringReader("hello; ");
		BufferedReader br = new BufferedReader(stringReader);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertEquals("hello", br1);
    }
}
