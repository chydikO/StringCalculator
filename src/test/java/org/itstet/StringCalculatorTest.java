package org.itstet;

import org.junit.jupiter.api.Test;

import static org.itstet.StringCalculator.add;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    @Test
    void kata01() {
        assertEquals(add(null), 0);
        assertEquals(add(""), 0);
        assertEquals(add("1"), 1);
        assertEquals(add(" 1,2"), 3);
        assertEquals(add(" 4,"), 4);
    }

    @Test
    void kata02() {
        assertEquals(add("1,2,3"), 6);
        assertEquals(add("1,1,1,1"), 4);
        assertEquals(add(" 1,2 "), 3);
        assertEquals(add("11,22,33"), 66);
    }
}
