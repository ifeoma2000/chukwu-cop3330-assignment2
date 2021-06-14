package ex35;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void pick2() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("george");
        name.add("kate");
        name.add("bill");
        name.add("chris");
        String actual = app.pick(name);
        assertTrue(name.contains(actual));
    }
    @Test
    void pick1() {
        App app = new App();
        ArrayList<String> name = new ArrayList<>();
        name.add("henry");
        name.add("bob");
        name.add("bill");
        name.add("chris");
        String actual = app.pick(name);
        assertTrue(name.contains(actual));
    }
}