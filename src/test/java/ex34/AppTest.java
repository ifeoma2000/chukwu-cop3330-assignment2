package ex34;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void removeName1() {
        App app = new App();
        String expected = "Chris Jones";
        String actual = app.removeName(new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"}, "Chris Jones");
        assertEquals(expected,actual);
    }
    @Test
    void removeName2() {
        App app = new App();
        String expected = "John Smith";
        String actual = app.removeName(new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"}, "John Smith");
        assertEquals(expected,actual);
    }
}