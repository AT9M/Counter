package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Counter_test {

    private Counter myCounter;

    @BeforeEach
    void init()
    {
        myCounter = new Counter();
    }

    @Test
    void testConstructor()
    {
        assertEquals(0,myCounter.getCount());
    }
}
