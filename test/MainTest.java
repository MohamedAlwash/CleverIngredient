import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;


class MainTest {
    @Test
    void givenTapSystemOut_whenInvokePrintln_thenOutputIsReturnedSuccessfully()
        throws Exception {

        String text = tapSystemOut(() -> Main.testMethod("Hello Baeldung Readers!!"));

        Assertions.assertEquals("Hello Baeldung Readers!!", text.trim());
    }
}