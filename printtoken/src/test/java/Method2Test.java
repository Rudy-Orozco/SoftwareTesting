import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method2Test {

    @Test
    void GetCharTest() throws Exception {
        Printtokens pt = new Printtokens();

        Method method = Printtokens.class.getDeclaredMethod("get_char", BufferedReader.class);
        method.setAccessible(true);
        
        FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

        int res = (int) method.invoke(pt, br);
        System.out.print("\n Result: " + res + "\n");
        assertNotNull(res, "get_char should return a char (casted int)");
    }
}
