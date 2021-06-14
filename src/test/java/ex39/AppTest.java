package ex39;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void put1() {
        App app = new App();
        ArrayList<Map<String, String[]>> expected = new ArrayList<>();
        TreeMap<String, String[]> temp1 = new TreeMap<>();
        TreeMap<String, String[]> temp2 = new TreeMap<>();
        temp1.put("Mark Al", new String[]{"Web Developer", "2015-12-18"});
        temp2.put("Sally Weber", new String[]{"Web Developer", "2015-12-18"});
        expected.add(temp1);
        expected.add(temp2);
        app.put("Sally Weber", new String[]{"Web Developer", "2015-12-18"});
        app.put("Mark Al", new String[]{"Web Developer", "2015-12-18"});
        ArrayList<Map<String, String[]>> actual = app.list;
        for (int i = 0; i < actual.size(); i++) {
            Map.Entry<String, String[]> ent1 = null;
            Map.Entry<String, String[]> ent2 = null;
            for (Map.Entry<String, String[]> ent : expected.get(i).entrySet())
                ent1 = ent;
            for (Map.Entry<String, String[]> ent : actual.get(i).entrySet())
                ent2 = ent;
            assertEquals(ent1.getKey(), ent2.getKey());
            assertArrayEquals(ent1.getValue(), ent2.getValue());
        }
    }

    @Test
    void put2() {
        App app = new App();
        ArrayList<Map<String, String[]>> expected = new ArrayList<>();
        TreeMap<String, String[]> temp3 = new TreeMap<>();
        TreeMap<String, String[]> temp4 = new TreeMap<>();
        temp3.put("Jacquelyn Jackson", new String[]{"DBA", ""});
        temp4.put("Tou Xiong", new String[]{"Software Engineer", "2016-10-05"});
        expected.add(temp3);
        expected.add(temp4);
        app.put("Tou Xiong", new String[]{"Software Engineer", "2016-10-05"});
        app.put("Jacquelyn Jackson", new String[]{"DBA", ""});
        ArrayList<Map<String, String[]>> actual = app.list;
        for (int i = 0; i < actual.size(); i++) {
            Map.Entry<String, String[]> ent1 = null;
            Map.Entry<String, String[]> ent2 = null;
            for (Map.Entry<String, String[]> ent : expected.get(i).entrySet())
                ent1 = ent;
            for (Map.Entry<String, String[]> ent : actual.get(i).entrySet())
                ent2 = ent;
            assertEquals(ent1.getKey(), ent2.getKey());
            assertArrayEquals(ent1.getValue(), ent2.getValue());
        }
    }
}