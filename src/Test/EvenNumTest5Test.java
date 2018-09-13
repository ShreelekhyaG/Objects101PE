package Test;

import Java.EvenNumTest5;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTest5Test {
    EvenNumTest5 evenNumTest5;
    @Before
    public void setUp() throws Exception {
        evenNumTest5=new EvenNumTest5();
    }

    @After
    public void tearDown() throws Exception {
        evenNumTest5=null;
    }

    @Test
    public void isEven() {
        assertEquals(
                "failed",
                true, evenNumTest5.isEven(4));
        assertEquals(
                "failed",
                false, evenNumTest5.isEven(13));
    }
    @Test
    public void isEvenFailure() {
        assertNotNull(
                "failed",
                 evenNumTest5.isEven(4));
        assertNotSame(
                "failed",
                false, evenNumTest5.isEven(0));
    }
}