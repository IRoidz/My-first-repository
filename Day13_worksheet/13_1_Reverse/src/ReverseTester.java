import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTester {

    @Test
    public void test() {
        Reverse reverse = new Reverse();
        String expected = "edcba";
        String actual = reverse.reverse("abcde");
        assertEquals(expected, actual);
    }

}