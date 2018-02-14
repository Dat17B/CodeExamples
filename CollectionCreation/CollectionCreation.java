package CH11;

import java.util.*;

public class CollectionCreation
{
    public static LinkedList<Integer> createList(int size, int maxRange) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++)
        {
            list.add((int)(Math.random() * maxRange));
        }

        return list;
    }

    public static Set<Integer> createHashSet(int size, int maxRange) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++)
        {
            set.add((int)(Math.random() * maxRange));
        }
        return set;
    }
    public static Set<Integer> createTreeSet(int size, int maxRange) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < size; i++)
        {
            set.add((int)(Math.random() * maxRange));
        }
        return set;
    }

    public static Map<String, String> createHashMapHard() {
        Map<String, String> value = new HashMap<>();
        value.put("3", "Marty");
        value.put("42", "Marty");
        value.put("31", "Dave");
        value.put("82", "Sue");
        value.put("17", "Ed");
        value.put("29", "Ed");
        value.put("56", "Ed");

        return value;
    }
    public static Map<String, String> createHashMapUnique()
    {
        Map<String, String> value = new HashMap<>();
        value.put("Marty", "Stepp");
        value.put("Stuart", "Reges");
        value.put("Jessica", "Miller");
        value.put("Amanda", "Camp");
        value.put("Hal", "Perkins");

        return value;
    }
    public static Map<String, String> createHashMapRedundant()
    {
        Map<String, String> value = new HashMap<>();
        value.put("Kendrick", "Perkins");
        value.put("Stuart", "Reges");
        value.put("Jessica", "Miller");
        value.put("Bruce", "Reges");
        value.put("Hal", "Perkins");

        return value;
    }
}
