package org.java.interview.letter;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

@RunWith(Parameterized.class)
public class LettersStatisticsTest {

    @Parameterized.Parameters(name = "{0}")
    public static List<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{"On stream", new LetterStatisticsOnStream()},
                new Object[]{"No stream", new LetterStatisticsNoStream()}
        );
    }

    private String name;
    private LetterStatistics letterStatistics;

    public LettersStatisticsTest(String name, LetterStatistics letterStatistics) {
        this.name = name;
        this.letterStatistics = letterStatistics;
    }

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
        expected.put('E', 5);
        expected.put('N', 3);

        Assert.assertNotNull(top);
        Assert.assertTrue(!top.isEmpty());
        Assert.assertEquals(expected, top);
    }
}
