package ex31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void calcHR1() {
        App app = new App();
        double expected = 164;
        double actual =(int) Math.round(app.calcHR(13, 100, 60));
        assertEquals(expected,actual);
    }
    @Test
    void calcHR2() {
        App app = new App();
        double expected = 185;
        double actual =(int) Math.round(app.calcHR(22, 65, 90));
        assertEquals(expected,actual);
    }
}