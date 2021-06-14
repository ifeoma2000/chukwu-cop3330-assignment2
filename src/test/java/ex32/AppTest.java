package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
//Please pick difficulty of 1
    @Test
    void runGame1() {
        App app = new App();
        int actual = app.genNum("1");
        assertTrue(actual>=1 && actual<=10);
    }
    @Test
    void runGame2() {
        App app = new App();
        int actual = app.genNum("2");
        assertTrue(actual>=1 && actual<=100);
    }
}