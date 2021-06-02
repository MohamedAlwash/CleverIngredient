import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GerechtTest {
    @Test
    public void testBerekenPrijs(){

        assertEquals(140, Gerecht.berekenPrijs(0, false, 8, false));
        assertEquals(60, Gerecht.berekenPrijs(3, true, 3, false));
    }
}