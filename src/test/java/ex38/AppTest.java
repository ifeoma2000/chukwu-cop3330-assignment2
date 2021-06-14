package ex38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void filterEvenNumbers1() {
        App app = new App();
        String[] expected = {null, "2", null, "4", null, "6", null, "8"};
        String[] actual = app.filterEvenNumbers(new String[]{"1", "2", "3", "4", "5", "6", "7", "8"});
        assertArrayEquals(expected, actual);
    }

    @Test
    void filterEvenNumbers2() {
        App app = new App();
        String[] expected = {null, "4", null, "6", null, "8"};
        String[] actual = app.filterEvenNumbers(new String[]{"3", "4", "5", "6", "7", "8"});
        assertArrayEquals(expected, actual);
    }
}