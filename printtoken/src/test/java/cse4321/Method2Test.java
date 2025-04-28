// Rudy Orozco
package cse4321;
import java.io.BufferedReader;
import java.io.FileReader;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class Method2Test {

    @Test
    void GetCharTest() throws Exception {
        Printtokens pt = new Printtokens();
        
        FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

        int res = pt.get_char(br);
        System.out.print("\n Result: " + res + "\n");
        
        assertNotNull(res, "get_char should return a char (casted int)");
    }
}
