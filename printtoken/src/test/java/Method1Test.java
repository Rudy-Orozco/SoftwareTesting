import java.io.BufferedReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method1Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void testOpenCharStream_txtfile() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("open_character_stream", String.class);
        method.setAccessible(true);

        BufferedReader br1 = (BufferedReader) method.invoke(pt, "text.txt");
        assertNotNull(br1, "BufferedReader should be created for valid file.");
    }

    @Test
    void testOpenCharStream_nullfile() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("open_character_stream", String.class);
        method.setAccessible(true);

        BufferedReader br2 = (BufferedReader) method.invoke(pt, (Object) null);
        assertNotNull(br2, "BufferedReader should be created for stdin.");
    }

}
