package org.paualgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private Main main;

    public MainTest() {
        main = new Main();
    }

    @Test
    public void dodawanieTest() {
        assertEquals(10, main.dodawanie(2, 8));
    }
}
