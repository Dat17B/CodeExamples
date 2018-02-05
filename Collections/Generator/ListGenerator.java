package Generator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGenerator
{
    /**
     * Random Integer List generator methods
     * @param size
     * @param maxRange
     * @return A linked list
     */
    public static LinkedList<Integer> createLinkedList(int size, int maxRange) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            list.add((int)(Math.random() * maxRange));
        }

        return list;
    }
    public static List<Integer> createList(int size, int maxRange) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            list.add((int)(Math.random() * maxRange));
        }

        return list;
    }
    public static ArrayList<Integer> createArrayList(int size, int maxRange) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++)
        {
            list.add((int)(Math.random() * maxRange));
        }

        return list;
    }

    /**
     * Creates a list with integers in sequence
     * @param startPoint
     * @param maxRange
     * @return
     */
    public static List<Integer> createSequenceList(int startPoint, int maxRange) {
        List<Integer> list = new ArrayList<>();
        for (int i = startPoint; i < maxRange; i++)
        {
            list.add(i);
        }

        return list;
    }
}
