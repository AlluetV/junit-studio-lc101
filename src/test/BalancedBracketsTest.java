package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {



    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void verifyHasBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void verifyStringNonBrackets() {
        assertFalse("expected false when string has not brackets",BalancedBrackets.hasBalancedBrackets("LaunchCode"));
    }

    @Test
    public void verifyHasUnbalancedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void verifySecondHasUnbalancedBrackets() {
        assertFalse("Expected false when the brackets order is:  ],[ ",BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }



}
