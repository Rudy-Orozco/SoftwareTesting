import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method5Test {
    Printtokens pt = new Printtokens();
    
    @Test
    void openCharStream1() throws Exception {
        Method method = Printtokens.class.getDeclaredMethod("get_token", BufferedReader.class);
        method.setAccessible(true);

        FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

        String br1 = (String) method.invoke(pt, br);
        System.out.print(br1);
        assertNotNull(br1);
    }
}
