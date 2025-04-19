import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import cse4321.Printtokens;

public class Method3Test {

    @Test
    void unGetCharTest() throws Exception {
        Printtokens pt = new Printtokens();

        Method method = Printtokens.class.getDeclaredMethod("get_char", BufferedReader.class);
        method.setAccessible(true);
        Method method1 = Printtokens.class.getDeclaredMethod("unget_char", int.class, BufferedReader.class);
        method1.setAccessible(true);
        
        FileReader fr = new FileReader("text.txt");
		BufferedReader br = new BufferedReader(fr);

        int num = (int) method.invoke(pt, br);
        Character res2 = (Character) method1.invoke(pt, num, br);

        System.out.print("\n Result: " + res2 + "\n");
        assertEquals(Character.class, res2.getClass());
    }
}
