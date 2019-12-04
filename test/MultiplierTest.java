import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by lee on 2019-11-29.
 */
public class MultiplierTest {

    @Test
    public void testMultiply() throws Exception {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(8,9),72);

    }

    @Test
    public void testMultiply1() throws Exception {
        Multiplier multiplier = new Multiplier();
        assertEquals(multiplier.Multiply(2,3,4),24);

    }
}