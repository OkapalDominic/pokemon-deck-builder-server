import hello.Greeting;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

class GreeterTest {
    private Greeting greeter = new Greeting(1, "Yo");

    @Test
    void greeterSaysHello() {
        assertThat(greeter.getContent(), containsString("Yo"));
    }
}
