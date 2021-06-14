package ex24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void isAnagram_returns_true_for_anagrams() {
        App app = new App();
        boolean expected = true;
        boolean actual = app.isAnagram("note", "note");
        assertEquals(expected,actual);
    }
    @Test
    void isAnagram_returns_false_for_anagrams() {
        App app = new App();
        boolean expected = false;
        boolean actual = app.isAnagram("toss", "short");
        assertEquals(expected,actual);
    }
}