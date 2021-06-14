package ex33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void eightBall1() {
      App app = new App();
        double actual = app.eightBall();
        assertTrue(actual>=0 && actual<=3);
    }
}