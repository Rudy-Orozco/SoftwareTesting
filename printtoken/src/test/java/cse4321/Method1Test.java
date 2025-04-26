package cse4321;

import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class Method1Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void testOpenCharStream_txtfile() throws Exception {
        BufferedReader br1 = pt.open_character_stream("text.txt");
        assertNotNull(br1);
    }

    @Test
    void testOpenCharStream_nullfile() throws Exception {
        BufferedReader br2 = pt.open_character_stream(null);
        assertNotNull(br2, "BufferedReader should be created for stdin.");
    }

    @Test
    void testOpenCharStream_invalfile() throws Exception {
        BufferedReader br1 = pt.open_character_stream("test.txt");
        assertNull(br1);
    }
}
