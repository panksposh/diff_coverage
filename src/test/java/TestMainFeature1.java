import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMainFeature1 {
    @Test
    public void testMultiply() {
        Main mainObj = new Main();
        int product = mainObj.multiply(4,3);
        assertEquals(12, product);
    }
}
