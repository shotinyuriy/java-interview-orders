package org.java.interview.letter;

import java.util.LinkedHashMap;
import java.util.List;

public interface LetterStatistics {
    /**
     * returns the first topSize entries from from the top of the list of the most frequent letters
     * the key is the capitalized letter, the value is the number of occurrences, non letter characters are ignored.
     * for example:
     * Given list: 111111, Pen 1, Pineapple, Apple, Pen 2, 222222
     * topSize: 3
     * Returned LinkedHashMap:
     * P -> 7
     * E -> 4
     * N -> 3
     *
     * @param topSize
     * @return
     */
    LinkedHashMap<Character, Integer> topFrequentLetters(List<String> strings, int topSize);
}
