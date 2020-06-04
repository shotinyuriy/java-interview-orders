package org.java.interview.letter;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class LettersStatisticsTest {
    LetterStatistics letterStatistics = new LetterStatistics();

    @Test
    public void testEmptyList() {
        LinkedHashMap<Character, Integer> top = letterStatistics.topFrequentLetters(new ArrayList<>(), 3);
        Assert.assertNotNull(top);
        Assert.assertTrue(top.isEmpty());
    }

    @Test
    public void testManyStrings() {
        List<String> strings = Arrays.asList("11111", "Pen 1", "Pineapple", "Apple", "Pen 2", "22222");
        LinkedHashMap<Character, Integer> top = letterStatistics.topFrequentLetters(strings, 3);

        LinkedHashMap<Character, Integer> expected = new LinkedHashMap<>();
        expected.put('P', 7);
        expected.put('E', 4);
        expected.put('N', 3);

        Assert.assertNotNull(top);
        Assert.assertTrue(top.isEmpty());
    }
}
