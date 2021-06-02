import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class RecipeTest {

    @Test
    public void testAddIngrediënt() {
        ArrayList<String> ingrediënten4 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2", "ingrediënt3", "ingrediënt4"));

        ArrayList<String> ingrediënten5 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2", "ingrediënt3", "ingrediënt4", "ingrediënt5"));

        ArrayList<String> ingrediënten3 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2", "ingrediënt3"));

        ArrayList<String> ingrediënten0 = new ArrayList<String>();

        ArrayList<String> ingrediënten2 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2"));

        ArrayList<String> ingrediënten14 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2", "ingrediënt3", "ingrediënt4", "ingrediënt5", "ingrediënt6", "ingrediënt7", "ingrediënt8", "ingrediënt9", "ingrediënt10", "ingrediënt11", "ingrediënt12", "ingrediënt13", "ingrediënt14"));

        ArrayList<String> ingrediënten15 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2","ingrediënt3", "ingrediënt4", "ingrediënt5", "ingrediënt6", "ingrediënt7", "ingrediënt8", "ingrediënt9", "ingrediënt10", "ingrediënt11", "ingrediënt12", "ingrediënt13", "ingrediënt14", "ingrediënt15"));

        ArrayList<String> ingrediënten16 = new ArrayList<String>(Arrays.asList("ingrediënt1", "ingrediënt2", "ingrediënt3", "ingrediënt4", "ingrediënt5", "ingrediënt6", "ingrediënt7", "ingrediënt8", "ingrediënt9","ingrediënt10", "ingrediënt11", "ingrediënt12", "ingrediënt13", "ingrediënt14", "ingrediënt15", "ingrediënt16"));


        Recipe eenRecept = new Recipe("Lasagne");
        Assertions.assertTrue(eenRecept.addIngrediënt(ingrediënten4));
        Assertions.assertTrue(eenRecept.addIngrediënt(ingrediënten5));
        Assertions.assertFalse(eenRecept.addIngrediënt(ingrediënten3));
        Assertions.assertFalse(eenRecept.addIngrediënt(ingrediënten0));
        Assertions.assertFalse(eenRecept.addIngrediënt(ingrediënten2));
        Assertions.assertTrue(eenRecept.addIngrediënt(ingrediënten14));
        Assertions.assertTrue(eenRecept.addIngrediënt(ingrediënten15));
        Assertions.assertFalse(eenRecept.addIngrediënt(ingrediënten16));
    }
}