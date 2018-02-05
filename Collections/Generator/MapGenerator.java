package Generator;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapGenerator
{
    /**
     * Creates map from tree map
     * @param keyRangeStart
     * @param keyRangeEnd
     * @param maxRangeValues
     * @return A tree map
     */
    public static Map<Integer, Integer> createMapFromTree(int keyRangeStart,
                                                  int keyRangeEnd,
                                                  int maxRangeValues) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = keyRangeStart; i < keyRangeEnd; i++)
        {
            map.put(i, (int)(Math.random() * maxRangeValues));
        }

        return map;
    }

    /**
     * Creates map from hash map
     * @param keyRangeStart
     * @param keyRangeEnd
     * @param maxRangeValues
     * @return A map
     */
    public static Map<Integer, Integer> createMapFromHash(int keyRangeStart,
                                                          int keyRangeEnd,
                                                          int maxRangeValues) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = keyRangeStart; i < keyRangeEnd; i++)
        {
            map.put(i, (int)(Math.random() * maxRangeValues));
        }

        return map;
    }

    // Sequence
    /**
     * Create map with sequence integers from value range start, from a hash map
     * @param keyRangeStart
     * @param keyRangeEnd
     * @param valueRangeStart
     * @return A hash map
     */
    public static Map<Integer, Integer> createMapFromHashSequence(int keyRangeStart,
                                                                  int keyRangeEnd,
                                                                  int valueRangeStart) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = keyRangeStart; i < keyRangeEnd; i++)
        {
            map.put(i, valueRangeStart);
            valueRangeStart++;
        }

        return map;
    }

    /**
     * Create map with sequence integers from value range start, from a tree map
     * @param keyRangeStart
     * @param keyRangeEnd
     * @param valueRangeStart
     * @return A tree map
     */
    public static Map<Integer, Integer> createMapFromTreeSequence(int keyRangeStart,
                                                                  int keyRangeEnd,
                                                                  int valueRangeStart) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = keyRangeStart; i < keyRangeEnd; i++)
        {
            map.put(i, valueRangeStart);
            valueRangeStart++;
        }

        return map;
    }
}
