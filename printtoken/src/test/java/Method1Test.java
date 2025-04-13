import cse4321.Printtokens;
import java.io.BufferedReader;
import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Method1Test {

    @Test
    void testOpenCharStreamWithReflection() throws Exception {
        Printtokens pt = new Printtokens();

        Method method = Printtokens.class.getDeclaredMethod("open_character_stream", String.class);
        method.setAccessible(true);

        BufferedReader br1 = (BufferedReader) method.invoke(pt, "text.txt");
        assertNotNull(br1, "BufferedReader should be created for valid file.");
        BufferedReader br2 = (BufferedReader) method.invoke(pt, (Object) null);
        assertNotNull(br2, "BufferedReader should be created for stdin.");
    }
}
