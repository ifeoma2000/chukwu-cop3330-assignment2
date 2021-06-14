package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void average() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("100");
        name.add("200");
        name.add("1000");
        name.add("300");
        double expected = 400;
        double actual = app.average(name);
        assertEquals(actual, expected);
    }

    @Test
    void min() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("100");
        name.add("200");
        name.add("1000");
        name.add("300");
      int expected = 100;
        int actual = app.min(name);
        assertEquals(actual, expected);
    }

    @Test
    void max() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("100");
        name.add("200");
        name.add("1000");
        name.add("300");
        int expected = 1000;
        int actual = app.max(name);
        assertEquals(actual, expected);
    }

    @Test
    void std() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("100");
        name.add("200");
        name.add("1000");
        name.add("300");
        double expected = 353.55;
        double actual = Math.round(app.std(name) * 100)/100.0;
        assertEquals(actual, expected);
    }
}