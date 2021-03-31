import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DataHandlerTest {

    @Test
    public void testShowPersons() {
        assertFalse(DataHandler.showPersons(false));

        DataHandler.addPerson("mo", "alwash");

        assertTrue(DataHandler.showPersons(false));
    }

    @Test
    public void testShowRecipes() {
        assertFalse(DataHandler.showRecipes());

//        DataHandler.addRecipe("Lasagne");

//        assertTrue(DataHandler.showRecipes());
    }
}