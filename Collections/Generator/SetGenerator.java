package Generator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetGenerator
{
    // Sequence integers
    /**
     * Sets created from a hash set and returned
     * @param noOfElements
     * @param maxRange
     * @return A hash set
     */
    public static Set<Integer> createSetFromHash(int noOfElements, int maxRange) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < noOfElements; i++)
        {
            set.add((int)(Math.random() * maxRange));
        }
        return set;
    }

    /**
     * Sets created from a tree set and returned
     * @param noOfElements
     * @param maxRange
     * @return A tree set
     */
    public static Set<Integer> createSetFromTree(int noOfElements, int maxRange) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < noOfElements; i++)
        {
            set.add((int)(Math.random() * maxRange));
        }
        return set;
    }

    // Random integers
    /**
     * Sets created from a hash set and returned
     * @param startPoint
     * @param endPoint
     * @return A hash set
     */
    public static Set<Integer> createSetFromHashSequence(int startPoint, int endPoint) {
        Set<Integer> set = new HashSet<>();
        for (int i = startPoint; i < endPoint; i++)
        {
            set.add(i);
        }
        return set;
    }

    /**
     * Sets created from a tree set and returned
     * @param startPoint
     * @param endPoint
     * @return A tree set
     */
    public static Set<Integer> createSetFromTreeSequence(int startPoint, int endPoint) {
        Set<Integer> set = new TreeSet<>();
        for (int i = startPoint; i < endPoint; i++)
        {
            set.add(i);
        }
        return set;
    }
}
