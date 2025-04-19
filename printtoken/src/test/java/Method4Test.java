import java.io.BufferedReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method4Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void openCharStream1() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("open_token_stream", String.class);
        method.setAccessible(true);

        BufferedReader br1 = (BufferedReader) method.invoke(pt, "text.txt");
        assertNotNull(br1);
    }

    @Test
    void openCharStream2() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("open_token_stream", String.class);
        method.setAccessible(true);

        BufferedReader br1 = (BufferedReader) method.invoke(pt, (Object) null);
        assertNotNull(br1);
    }
}
