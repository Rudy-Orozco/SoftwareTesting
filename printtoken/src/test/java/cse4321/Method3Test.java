package cse4321;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class Method3Test {

    @Test
    void unGetCharTest() throws Exception {
        Printtokens pt = new Printtokens();
        
        FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

        int num = pt.unget_char(1, br);

        System.out.print("\n Result: " + num + "\n");
        assertEquals(0, num);
    }
}
