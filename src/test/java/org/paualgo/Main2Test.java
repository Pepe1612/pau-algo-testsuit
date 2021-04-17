package org.paualgo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main2Test {
    private Main main;

    public Main2Test() {
        main = new Main();
    }

    @Test
    public void dodawanie2Test() {
        assertEquals(10, main.dodawanie(5, 5));
    }
}