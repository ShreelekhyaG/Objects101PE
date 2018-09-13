package Test;

import Java.Palindrome1;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Palindrome1Test {
    Palindrome1 palindrome1;
    @Before
    public void setUp() throws Exception {
        palindrome1=new Palindrome1();
    }

    @After
    public void tearDown() throws Exception {
        palindrome1=null;
    }
    @Test
    public void testReverseInput() {

        assertEquals(
                "Reversing failed",
                "madam", palindrome1.reverseInput("madam"));
        assertEquals(
                "Reversing failed",
                "4321", palindrome1.reverseInput("1234"));
        assertEquals(
                "Reversing failed",
                null, palindrome1.reverseInput(null));

    }
    @Test
    public void testReverseInputFailure() {
        assertNotNull(
                "Reversing failed",
                palindrome1.reverseInput("shreelekhya"));
        assertNotSame("Check alphabet case","ayhkeleerhs",palindrome1.reverseInput("Shreelekhya"));

    }
    @Test
    public void testCheckPalindrome() {
        assertEquals(
                "palindrome checking failed for a palindrome",
                "yes", palindrome1.checkPalindrome("madam"));
        assertEquals(
                "palindrome checking failed for not a palindrome",
                "no", palindrome1.checkPalindrome("1234"));
    }
    @Test
    public void testCheckPalindromeFailure() {
        assertNotNull(
                "palindrome check failed",
                palindrome1.checkPalindrome("shreelekhya123"));
        assertNotSame("Check failed","ayhkeleerhs",palindrome1.checkPalindrome("Shreelekhya"));

    }
}