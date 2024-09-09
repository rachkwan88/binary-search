package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        BinarySearcher searcher = new BinarySearcher();
        int[] values = { 0 };
        assertTrue(searcher.searchByRecursion(values, 0, 0, 0) == 0);

        int[] values1 = { 0, 1 };
        assertTrue(searcher.searchByRecursion(values1, 0, 1, 0) == 0);
        assertTrue(searcher.searchByRecursion(values1, 0, 1, 1) == 1);

        int[] values2 = { 3, 4, 5, 6, 7 };
        assertTrue(searcher.searchByRecursion(values2, 0, 4, 4) == 1);

        int[] values3 = { -2, -1, 0 };
        assertTrue(searcher.searchByRecursion(values3, 0, 2, -1) == 1);
        assertTrue(searcher.searchByRecursion(values3, 0, 2, 0) == 2);
        assertTrue(searcher.searchByRecursion(values3, 0, 2, -2) == 0);

        assertTrue(searcher.searchByRecursion(values, 0, 0, 1) == -1);

        int[] values4 = {};
        assertTrue(searcher.searchByRecursion(values4, 0, 0, 1) == -1);

        assertTrue(searcher.searchByIteration(values, 0, 0, 0) == 0);

        assertTrue(searcher.searchByIteration(values1, 0, 1, 0) == 0);
        assertTrue(searcher.searchByIteration(values1, 0, 1, 1) == 1);

        assertTrue(searcher.searchByIteration(values2, 0, 4, 4) == 1);

        assertTrue(searcher.searchByIteration(values3, 0, 2, -1) == 1);
        assertTrue(searcher.searchByIteration(values3, 0, 2, 0) == 2);
        assertTrue(searcher.searchByIteration(values3, 0, 2, -2) == 0);

        assertTrue(searcher.searchByIteration(values, 0, 0, 1) == -1);

        assertTrue(searcher.searchByIteration(values4, 0, 0, 1) == -1);
    }
}
