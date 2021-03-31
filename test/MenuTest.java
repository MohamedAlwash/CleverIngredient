import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


class MenuTest {

    @Test
    void testMenuList() throws Exception {
        Menu menu = new Menu();

//        String text = tapSystemOut(menu::menuList);
//
//        Assertions.assertEquals("Voer een cijfer in!", text.trim());
    }
}