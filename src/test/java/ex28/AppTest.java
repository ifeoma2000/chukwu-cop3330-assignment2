package ex28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void numberCalculator1() {
        App app = new App();
        int expected = 5;
        int actual = app.numberCalculator(1,1,1,1,1);
        assertEquals(expected,actual);
    }
    @Test
    void numberCalculator2() {
        App app = new App();
        int expected = 17;
        int actual = app.numberCalculator(1,5,1,6,4);
        assertEquals(expected,actual);
    }
}