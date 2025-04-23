package cse4321;
import java.io.BufferedReader;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;


public class Method4Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void openCharStream1() throws Exception {
        BufferedReader br1 = pt.open_token_stream("text.txt");
        assertNotNull(br1);
    }

    @Test
    void openCharStream2() throws Exception {
        BufferedReader br1 = pt.open_token_stream(null);
        assertNotNull(br1);
    }
}
