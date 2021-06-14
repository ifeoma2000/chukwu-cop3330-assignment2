package ex25;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void passwordValidator_for_password1() {
        App app = new App();
        int expected = 1;
        int actual = app.passwordValidator("abcdef");
        assertEquals(expected,actual);
    }
    @Test
            void passwordValidator_for_password2()
    {
        App app = new App();
        int expected = 3;
        int actual = app.passwordValidator("1337h@xor!");
        assertEquals(expected,actual);
    }
}
