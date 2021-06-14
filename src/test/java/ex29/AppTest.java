package ex29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void quickCalculator1() {
        App app = new App();
        double expected = 18;
        double actual = app.quickCalculator(4);
        assertEquals(expected,actual);
    }
    @Test
    void quickCalculator2() {
        App app = new App();
        double expected = 24;
        double actual = app.quickCalculator(3);
        assertEquals(expected,actual);
    }
}