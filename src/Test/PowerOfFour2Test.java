package Test;

import Java.PowerOfFour2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfFour2Test {
    PowerOfFour2 powerOfFour2;
    @Before
    public void setUp() throws Exception {
        powerOfFour2 =new PowerOfFour2();
    }

    @After
    public void tearDown() throws Exception {
        powerOfFour2 =null;
    }

    @Test
    public void isPowerOf4() {
        assertEquals(
                "Invalid",
                true, powerOfFour2.isPowerOf4(64));
        assertEquals(
                "Invalid",
                false, powerOfFour2.isPowerOf4(2));
    }
    @Test
    public void isPowerOf4NotNull() {
        assertNotNull(
                "Invalid",
                powerOfFour2.isPowerOf4(0));
        assertNotSame("Check alphabet case",true, powerOfFour2.isPowerOf4(8));

    }
}