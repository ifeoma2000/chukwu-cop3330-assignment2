package ex27;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void validateInput1()
    {
    App app = new App();
        int expected = 1;
        int actual = app.validateInput("J"," ", " A12-1234"," ABCDE");
        assertEquals(expected,actual);
    }
    @Test
    void validateInput2()
    {
        App app = new App();
        int expected = 0;
        int actual = app.validateInput("Jimmy","James", "AA-1234","55555");
        assertEquals(expected,actual);
    }
}