import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void testGetInitials_NormalName() {
        String input = "Jane  Doe";
        Person p = new Person(input);
        String actual = p.getInitials();
        String expected = "JD";
        assertEquals(expected, actual);
    }
}
