import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMain {
    @Test
    public void testAdd() {
        Main mainObj = new Main();
        int sum = mainObj.add(1,3);
        assertEquals(4, sum);
    }
}
