package ie.gmit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CounterTest {

    private Counter myCounter;

    @BeforeEach
    void init(TestInfo testInfo,TestReporter testReporter)
    {
        testReporter.publishEntry("Testing  "+testInfo.getDisplayName());
        myCounter = new Counter();
    }
    @DisplayName("Test Constructor")
    @Test
    void testConstructor()
    {
        Assertions.assertEquals(0,myCounter.getCount());
    }
    @DisplayName("Test Increment")
    @Test
    void testIncrement()
    {
        Assertions.assertEquals(1,myCounter.Increment());
    }
    @DisplayName("Test Decrement")
    @Test
    void testDecrement()
    {
        Assertions.assertEquals(-1,myCounter.Decrement());
    }

    @DisplayName("Test Multiply")
    @Test
    void testMuliply()
    {
        Assertions.assertEquals(25,myCounter.Multiply(5,5));
    }

    @DisplayName("Test Divide")
    @Test
    void testDivide()
    {
        Assertions.assertEquals(1,myCounter.Divide(5,5));
    }

    @DisplayName("Test Division by 0")
    @Test
    void testDivideZero()
    {
        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                Counter counter = new  Counter();
                counter.Divide(5,0);
            }
        });
    }
    @DisplayName("Test Constructor with Wrong Value")
    @Test
    void testConstructiveWithWrongValue()
    {
        assertThrows(IllegalArgumentException.class, new Executable() {
            public void execute() throws Throwable {
                new Counter(-1);
            }
        });
    }
    @DisplayName("Test Constructor with Good Value")
    @Test
    void testConstructiveWithGoodValue()
    {
        Counter counter = new  Counter(5);
        Assertions.assertEquals(5,counter.getCount());
    }
}
