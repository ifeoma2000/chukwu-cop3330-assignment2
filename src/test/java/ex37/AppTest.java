package ex37;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordGenerator1() {
        App app = new App();
        String actual = app.passwordGenerator(6,2,2);
        assertTrue(actual.length()>=6);
    }
    @Test
    void passwordGenerator2() {
        App app = new App();
        String actual = app.passwordGenerator(8,2,2);
        assertTrue(actual.length()>=8);
    }
}