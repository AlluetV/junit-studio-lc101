package test;

import main.BonusBinarySearch;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void verifyNumberNotIntoArray() {
        assertEquals(-1, BonusBinarySearch.binarySearch(new int[]{1, 4, 7, 9}, 11));
    }

    @Test
    public void verifyNumberInArray() {
        assertEquals(1, BonusBinarySearch.binarySearch(new int[]{1, 4, 7, 9}, 4));
    }

}
